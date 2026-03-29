package iuh.fit.observer;

import java.util.ArrayList;
import java.util.List;

public class LibraryNotifier {
    private static LibraryNotifier instance;
    private List<LibraryObserver> observers = new ArrayList<>();

    private LibraryNotifier() {}
    public static LibraryNotifier getInstance() {
        if (instance == null) instance = new LibraryNotifier();
        return instance;
    }

    public void register(LibraryObserver o)   { observers.add(o); }
    public void unregister(LibraryObserver o) { observers.remove(o); }

    public void notifyObservers(String event, String bookTitle) {
        observers.forEach(o -> o.update(event, bookTitle));
    }
}
