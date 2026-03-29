package iuh.fit.theodoicongviec;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String status;
    private List<TaskObserver> observers = new ArrayList<>();

    public Task(String name) {
        this.name   = name;
        this.status = "TODO";
    }

    public void register(TaskObserver o)   { observers.add(o); }
    public void unregister(TaskObserver o) { observers.remove(o); }

    public void setStatus(String status) {
        System.out.println("\n[Task: " + name + "] Trạng thái: " + this.status + " → " + status);
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TaskObserver o : observers) {
            o.onTaskUpdated(name, status);
        }
    }
}