package iuh.fit.decorator;

public abstract class BorrowDecorator implements BorrowService {
    protected BorrowService wrapped;
    public BorrowDecorator(BorrowService s) { this.wrapped = s; }
    public void borrow()      { wrapped.borrow(); }
    public int getDuration()  { return wrapped.getDuration(); }
}