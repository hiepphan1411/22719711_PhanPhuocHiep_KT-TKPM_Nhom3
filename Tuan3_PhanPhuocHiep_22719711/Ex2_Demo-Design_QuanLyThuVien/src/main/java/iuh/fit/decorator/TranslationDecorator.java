package iuh.fit.decorator;

public class TranslationDecorator extends BorrowDecorator {
    private String language;
    public TranslationDecorator(BorrowService s, String language) {
        super(s);
        this.language = language;
    }
    public void borrow() {
        super.borrow();
        System.out.println("  [+] Yêu cầu bản dịch: " + language);
    }
}