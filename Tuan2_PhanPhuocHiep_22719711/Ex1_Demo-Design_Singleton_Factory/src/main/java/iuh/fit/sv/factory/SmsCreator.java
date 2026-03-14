package iuh.fit.sv.factory;

public class SmsCreator extends NotificationCreator{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
