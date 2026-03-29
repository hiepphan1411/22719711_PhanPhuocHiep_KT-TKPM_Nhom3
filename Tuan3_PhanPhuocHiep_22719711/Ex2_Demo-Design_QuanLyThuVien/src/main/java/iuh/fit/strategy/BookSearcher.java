package iuh.fit.strategy;

import iuh.fit.Book;
import iuh.fit.singleton.Library;

import java.util.List;

public class BookSearcher {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Book> search(String keyword) {
        return strategy.search(Library.getInstance().getBooks(), keyword);
    }
}