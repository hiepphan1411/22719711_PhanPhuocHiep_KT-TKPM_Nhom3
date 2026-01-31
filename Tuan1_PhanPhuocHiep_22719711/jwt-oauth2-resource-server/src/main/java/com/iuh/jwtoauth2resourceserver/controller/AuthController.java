package com.iuh.jwtoauth2resourceserver.controller;


import com.iuh.jwtoauth2resourceserver.model.LoginRequest;
import com.iuh.jwtoauth2resourceserver.model.TokenResponse;
import com.iuh.jwtoauth2resourceserver.service.TokenService;
import com.iuh.jwtoauth2resourceserver.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    private final UserService userService;

    public AuthController(AuthenticationManager authenticationManager,
                          TokenService tokenService,
                          UserService userService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
        this.userService = userService;
    }

    /**
     * Login và nhận Access Token + Refresh Token
     */
    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        String accessToken = tokenService.generateAccessToken(authentication);
        String refreshToken = tokenService.generateRefreshToken(authentication.getName());

        userService.saveRefreshToken(authentication.getName(), refreshToken);

        return ResponseEntity.ok(new TokenResponse(
                accessToken,
                refreshToken,
                tokenService.getAccessTokenExpiration()
        ));
    }

    /**
     * Refresh Access Token bằng Refresh Token
     */
    @PostMapping("/refresh")
    public ResponseEntity<?> refreshToken(@RequestBody Map<String, String> request) {
        String refreshToken = request.get("refreshToken");

        if (refreshToken == null || !tokenService.validateToken(refreshToken)) {
            return ResponseEntity.badRequest().body("Invalid refresh token");
        }

        String username = tokenService.getUsernameFromToken(refreshToken);
        var user = userService.findByUsername(username);

        if (!refreshToken.equals(user.getRefreshToken())) {
            return ResponseEntity.badRequest().body("Refresh token not match");
        }

        Authentication authentication = new UsernamePasswordAuthenticationToken(
                username, null,
                java.util.Collections.singletonList(new org.springframework.security.core.authority.SimpleGrantedAuthority(user.getRole()))
        );

        String newAccessToken = tokenService.generateAccessToken(authentication);

        return ResponseEntity.ok(Map.of(
                "accessToken", newAccessToken,
                "tokenType", "Bearer",
                "expiresIn", tokenService.getAccessTokenExpiration()
        ));
    }

    /**
     * Logout - Xóa refresh token
     */
    @PostMapping("/logout")
    public ResponseEntity<?> logout(Authentication authentication) {
        userService.deleteRefreshToken(authentication.getName());
        return ResponseEntity.ok(Map.of("message", "Logged out successfully"));
    }
}