package iuh.fit.file.manager;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("readme.txt", 10);
        File f2 = new File("photo_22719711_PhanPhuocHiep.png", 500);
        File f3 = new File("report.pdf", 200);

        Directory docs = new Directory("Documents");
        docs.add(f1);
        docs.add(f3);

        Directory root = new Directory("Root");
        root.add(docs);
        root.add(f2);

        root.show("");
        System.out.println("Tổng dung lượng: " + root.getSize() + " KB");
    }
}