package iuh.fit.chuyendoifile;

public class Main {
    public static void main(String[] args) {
        System.out.println("DÙNG WEBSERVICE THÔNG THƯỜNG");
        JsonService webService = new WebService();
        webService.processJson("{\"user\": \"HiepPhan\"}");

        System.out.println("\nDÙNG ADAPTER CHO XMLSYSTEM");
        XmlSystem xmlSystem = new XmlSystem();
        JsonService adapter = new XmlToJsonAdapter(xmlSystem);
        String result = adapter.processJson("{\"user\": \"hiep\"}");
        System.out.println("[Client] Nhận kết quả: " + result);
    }
}
