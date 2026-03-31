package iuh.fit.factory;

import iuh.fit.Book;
import iuh.fit.observer.LibraryNotifier;
import iuh.fit.singleton.Library;

public abstract class BookCreator {
    public abstract Book createBook(String title, String author, String genre);

    public void addToLibrary(String title, String author, String genre) {
        Book book = createBook(title, author, genre);
        Library.getInstance().addBook(book);
        // Thông báo Observer khi có sách mới
        LibraryNotifier.getInstance().notifyObservers("SÁCH MỚI", title);
    }
}