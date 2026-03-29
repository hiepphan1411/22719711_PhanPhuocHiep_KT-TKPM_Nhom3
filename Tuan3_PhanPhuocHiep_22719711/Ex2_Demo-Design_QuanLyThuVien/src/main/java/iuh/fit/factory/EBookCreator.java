package iuh.fit.factory;

import iuh.fit.Book;
import iuh.fit.EBook;

public class EBookCreator extends BookCreator {
    public Book createBook(String title, String author, String genre) {
        return new EBook(title, author, genre);
    }
}
