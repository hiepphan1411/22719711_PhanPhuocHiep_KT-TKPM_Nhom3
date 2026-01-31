package com.iuh.jwtoauth2resourceserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ResourceController {

    /**
     * Endpoint công khai
     */
    @GetMapping("/public")
    public Map<String, String> publicEndpoint() {
        return Map.of("message", "This is a public endpoint");
    }

    /**
     * Endpoint yêu cầu authentication
     */
    @GetMapping("/user")
    public Map<String, Object> userEndpoint(Authentication authentication) {
        return Map.of(
                "message", "Hello " + authentication.getName(),
                "authorities", authentication.getAuthorities()
        );
    }

    /**
     * Endpoint chỉ dành cho ADMIN
     */
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public Map<String, String> adminEndpoint() {
        return Map.of("message", "Admin only endpoint");
    }
}