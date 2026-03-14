package iuh.fit.sv.factory;

import iuh.fit.sv.singleton.AppLogger;

public class SmsNotification implements Notification{
    @Override
    public void send(String to, String content) {
        AppLogger.getInstance().log("Gửi SMS đến " + to + ": " + content);
    }
}
