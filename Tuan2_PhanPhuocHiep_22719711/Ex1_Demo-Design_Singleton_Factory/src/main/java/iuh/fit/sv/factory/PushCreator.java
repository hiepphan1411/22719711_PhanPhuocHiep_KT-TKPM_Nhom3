package iuh.fit.sv.factory;

public class PushCreator extends NotificationCreator{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
