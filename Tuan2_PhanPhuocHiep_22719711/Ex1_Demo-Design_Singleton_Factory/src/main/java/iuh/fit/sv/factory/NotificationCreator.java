package iuh.fit.sv.factory;

public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void notify(String to, String content) {
        Notification n = createNotification();
        n.send(to, content);
    }
}
