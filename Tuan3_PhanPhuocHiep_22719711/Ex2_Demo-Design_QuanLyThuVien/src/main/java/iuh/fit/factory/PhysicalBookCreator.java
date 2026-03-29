package iuh.fit.factory;

import iuh.fit.Book;
import iuh.fit.PhysicalBook;

public class PhysicalBookCreator extends BookCreator {
    public Book createBook(String title, String author, String genre) {
        return new PhysicalBook(title, author, genre);
    }
}
