package iuh.fit.component.ui.manager;

public class Main {
    public static void main(String[] args) {
        UIContainer loginForm = new UIContainer("Login Form");
        loginForm.add(new TextBox("Nhập email..."));
        loginForm.add(new TextBox("Nhập mật khẩu..."));
        loginForm.add(new Button("Đăng nhập"));

        UIContainer navbar = new UIContainer("Navbar");
        navbar.add(new Button("Trang chủ"));
        navbar.add(new Button("Giới thiệu"));

        UIContainer page = new UIContainer("Trang chủ");
        page.add(navbar);
        page.add(loginForm);

        page.render("");
    }
}
