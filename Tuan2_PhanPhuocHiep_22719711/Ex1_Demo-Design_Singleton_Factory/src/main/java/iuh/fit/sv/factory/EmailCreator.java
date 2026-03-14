package iuh.fit.sv.factory;

public class EmailCreator extends NotificationCreator{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
