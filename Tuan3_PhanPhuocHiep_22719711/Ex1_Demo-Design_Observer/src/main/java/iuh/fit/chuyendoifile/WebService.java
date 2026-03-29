package iuh.fit.chuyendoifile;

public class WebService implements JsonService {
    @Override
    public String processJson(String jsonData) {
        System.out.println("[WebService] Xử lý JSON: " + jsonData);
        return "{\"status\": \"ok\"}";
    }
}
