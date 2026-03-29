package iuh.fit.strategy;

import iuh.fit.Book;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
}
