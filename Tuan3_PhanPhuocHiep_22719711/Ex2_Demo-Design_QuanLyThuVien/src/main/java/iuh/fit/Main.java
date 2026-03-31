package iuh.fit;


import iuh.fit.decorator.BasicBorrow;
import iuh.fit.decorator.BorrowService;
import iuh.fit.decorator.ExtendedBorrowDecorator;
import iuh.fit.decorator.TranslationDecorator;
import iuh.fit.factory.AudioBookCreator;
import iuh.fit.factory.EBookCreator;
import iuh.fit.factory.PhysicalBookCreator;
import iuh.fit.observer.LibraryNotifier;
import iuh.fit.observer.LibraryStaff;
import iuh.fit.observer.RegisteredUser;
import iuh.fit.singleton.Library;
import iuh.fit.strategy.BookSearcher;
import iuh.fit.strategy.SearchByAuthor;
import iuh.fit.strategy.SearchByGenre;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Observer: Đăng ký nhận thông báo
        LibraryNotifier notifier = LibraryNotifier.getInstance();
        notifier.register(new LibraryStaff("Hiep_22719711"));
        notifier.register(new RegisteredUser("user_an"));

        // Factory method: thêm sách => tự động thông báo Observer
        System.out.println("===== THÊM SÁCH =====");
        new PhysicalBookCreator().addToLibrary("Lập Trình Java", "James Gosling", "Công nghệ");
        new EBookCreator().addToLibrary("Design Patterns", "Gang of Four", "Công nghệ");
        new AudioBookCreator().addToLibrary("Đắc Nhân Tâm", "Dale Carnegie", "Kỹ năng");

        // Singleton: xem danh sách
        Library.getInstance().listAvailable();

        // Strategy: tìm kiếm
        System.out.println("\n===== TÌM KIẾM =====");
        BookSearcher searcher = new BookSearcher();

        searcher.setStrategy(new SearchByAuthor());
        List<Book> results = searcher.search("Dale");
        System.out.println("Tìm theo tác giả 'Dale': ");
        results.forEach(b -> System.out.println("  → " + b.getTitle()));

        searcher.setStrategy(new SearchByGenre());
        results = searcher.search("Công nghệ");
        System.out.println("Tìm theo thể loại 'Công nghệ': ");
        results.forEach(b -> System.out.println("  => " + b.getTitle()));

        // Observer: thông báo sách hết hạn
        System.out.println("\n===== THÔNG BÁO HẾT HẠN =====");
        notifier.notifyObservers("HẾT HẠN MƯỢN", "Lập Trình Java");

        // Decorator: mượn sách với tính năng bổ sung
        System.out.println("\n===== MƯỢN SÁCH =====");
        BorrowService borrow = new TranslationDecorator(
                new ExtendedBorrowDecorator(
                        new BasicBorrow("Design Patterns"), 7),
                "Tiếng Việt");
        borrow.borrow();
    }
}