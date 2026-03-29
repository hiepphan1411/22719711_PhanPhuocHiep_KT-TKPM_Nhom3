package iuh.fit.singleton;

import iuh.fit.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static volatile Library instance;
    private List<Book> books = new ArrayList<>();

    private Library() {}

    public static Library getInstance() {
        if (instance == null) {
            synchronized (Library.class) {
                if (instance == null) instance = new Library();
            }
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("[Thư viện] Đã thêm: [" + book.getType() + "] "
                + book.getTitle() + " - " + book.getAuthor());
    }

    public List<Book> getBooks() { return books; }

    public void listAvailable() {
        System.out.println("\nDanh sách sách hiện có:");
        books.forEach(b -> System.out.println("  - [" + b.getType() + "] "
                + b.getTitle() + " | " + b.getAuthor()
                + " | " + b.getGenre()));
    }
}
