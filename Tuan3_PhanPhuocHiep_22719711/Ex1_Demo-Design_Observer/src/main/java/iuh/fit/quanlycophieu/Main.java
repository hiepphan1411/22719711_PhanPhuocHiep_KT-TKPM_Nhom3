package iuh.fit.quanlycophieu;

public class Main {
    public static void main(String[] args) {
        Stock vnm = new Stock("VNM", 80000);

        Investor hiep = new Investor("Phan Phước Hiệp");
        Investor pph   = new Investor("PPH");
        MobileApp app  = new MobileApp();

        vnm.register(hiep);
        vnm.register(pph);
        vnm.register(app);

        vnm.setPrice(82000);

        vnm.unregister(pph);  // Hủy đăng ký, thì pph ko nhận thông báo nữa
        vnm.setPrice(79000);
    }
}
