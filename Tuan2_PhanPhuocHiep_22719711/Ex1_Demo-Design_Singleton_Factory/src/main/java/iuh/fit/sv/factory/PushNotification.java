package iuh.fit.sv.factory;

import iuh.fit.sv.singleton.AppLogger;

public class PushNotification implements Notification{
    @Override
    public void send(String to, String content) {
        AppLogger.getInstance().log("Gửi PUSH đến " + to + ": " + content);
    }
}
