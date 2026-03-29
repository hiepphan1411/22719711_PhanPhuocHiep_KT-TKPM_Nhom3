package iuh.fit.quanlycophieu;

public class Investor implements StockObserver {
    private String name;
    public Investor(String name) { this.name = name; }

    @Override
    public void update(String stockName, double price) {
        System.out.println("  [Nhà đầu tư " + name + "] nhận thông báo: "
                + stockName + " = " + price + " VNĐ");
    }
}
