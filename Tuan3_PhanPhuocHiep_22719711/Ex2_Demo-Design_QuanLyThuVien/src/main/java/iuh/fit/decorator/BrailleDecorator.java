package iuh.fit.decorator;

public class BrailleDecorator extends BorrowDecorator {
    public BrailleDecorator(BorrowService s) { super(s); }
    public void borrow() {
        super.borrow();
        System.out.println("  [+] Yêu cầu phiên bản chữ nổi (Braille)");
    }
}