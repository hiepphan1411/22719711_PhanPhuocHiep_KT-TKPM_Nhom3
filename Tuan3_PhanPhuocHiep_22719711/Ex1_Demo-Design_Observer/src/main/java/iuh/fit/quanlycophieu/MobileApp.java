package iuh.fit.quanlycophieu;

public class MobileApp implements StockObserver {
    @Override
    public void update(String stockName, double price) {
        System.out.println("  [Mobile Alert] " + stockName + " cập nhật giá: " + price + " VNĐ");
    }
}