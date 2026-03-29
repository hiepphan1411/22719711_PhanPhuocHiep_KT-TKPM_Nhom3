package iuh.fit.chuyendoifile;

public class XmlToJsonAdapter implements JsonService {
    private XmlSystem xmlSystem;

    public XmlToJsonAdapter(XmlSystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }

    @Override
    public String processJson(String jsonData) {

        String xml = convertJsonToXml(jsonData);
        System.out.println("[Adapter] Chuyển JSON → XML: " + xml);

        String xmlResult = xmlSystem.processXml(xml);

        String jsonResult = convertXmlToJson(xmlResult);
        System.out.println("[Adapter] Chuyển XML → JSON: " + jsonResult);
        return jsonResult;
    }

    private String convertJsonToXml(String json) {
        // Test
        return "<root>" + json.replace("{", "").replace("}", "")
                .replace("\"", "").replace(":", ">")
                .replace(",", "</field><field>")
                + "</root>";
    }

    private String convertXmlToJson(String xml) {
        // Test
        return "{\"result\": \"" + xml.replaceAll("<[^>]+>", "") + "\"}";
    }
}