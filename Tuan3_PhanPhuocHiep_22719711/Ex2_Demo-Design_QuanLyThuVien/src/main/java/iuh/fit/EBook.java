package iuh.fit;

public class EBook implements Book {
    private String title, author, genre;
    public EBook(String title, String author, String genre) {
        this.title = title; this.author = author; this.genre = genre;
    }
    public String getTitle()  { return title; }
    public String getAuthor() { return author; }
    public String getGenre()  { return genre; }
    public String getType()   { return "Sách điện tử"; }
}
