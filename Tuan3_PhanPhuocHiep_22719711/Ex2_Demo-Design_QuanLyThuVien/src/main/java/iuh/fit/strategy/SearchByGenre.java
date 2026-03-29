package iuh.fit.strategy;

import iuh.fit.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByGenre implements SearchStrategy {
    public List<Book> search(List<Book> books, String keyword) {
        return books.stream()
                .filter(b -> b.getGenre().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}