package iuh.fit.factory;

import iuh.fit.AudioBook;
import iuh.fit.Book;

public class AudioBookCreator extends BookCreator {
    public Book createBook(String title, String author, String genre) {
        return new AudioBook(title, author, genre);
    }
}
