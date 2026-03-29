package iuh.fit.observer;

public class RegisteredUser implements LibraryObserver {
    private String username;
    public RegisteredUser(String username) { this.username = username; }

    public void update(String event, String bookTitle) {
        System.out.println("  [Người dùng " + username + "] Thông báo: '"
                + event + "' - \"" + bookTitle + "\"");
    }
}