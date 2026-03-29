package iuh.fit.decorator;

public class BasicBorrow implements BorrowService {
    private String bookTitle;
    public BasicBorrow(String bookTitle) { this.bookTitle = bookTitle; }

    public void borrow() {
        System.out.println("  Mượn sách: \"" + bookTitle + "\" | Thời hạn: "
                + getDuration() + " ngày");
    }
    public int getDuration() { return 14; }
}