package iuh.fit.sv.factory;

import iuh.fit.sv.singleton.AppLogger;

public class EmailNotification implements Notification {

    @Override
    public void send(String to, String content) {
        AppLogger.getInstance().log("Gửi EMAIL đến " + to + ": " + content);
    }
}
