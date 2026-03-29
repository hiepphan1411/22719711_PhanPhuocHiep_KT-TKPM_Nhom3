package iuh.fit.quanlycophieu;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private double price;
    private List<StockObserver> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void register(StockObserver o)   { observers.add(o); }
    public void unregister(StockObserver o) { observers.remove(o); }

    public void setPrice(double price) {
        System.out.println("\n[" + name + "] Giá thay đổi: " + this.price + " → " + price);
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver o : observers) {
            o.update(name, price);
        }
    }
}