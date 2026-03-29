package iuh.fit.observer;

public class LibraryStaff implements LibraryObserver {
    private String name;
    public LibraryStaff(String name) { this.name = name; }

    public void update(String event, String bookTitle) {
        System.out.println("  [Nhân viên " + name + "] Sự kiện '" + event
                + "': sách \"" + bookTitle + "\"");
    }
}
