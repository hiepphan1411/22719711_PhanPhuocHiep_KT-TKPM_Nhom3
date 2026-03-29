package iuh.fit.decorator;

public class ExtendedBorrowDecorator extends BorrowDecorator {
    private int extraDays;
    public ExtendedBorrowDecorator(BorrowService s, int extraDays) {
        super(s);
        this.extraDays = extraDays;
    }
    public void borrow() {
        super.borrow();
        System.out.println("  [+] Gia hạn thêm " + extraDays + " ngày → Tổng: "
                + getDuration() + " ngày");
    }
    public int getDuration() { return super.getDuration() + extraDays; }
}
