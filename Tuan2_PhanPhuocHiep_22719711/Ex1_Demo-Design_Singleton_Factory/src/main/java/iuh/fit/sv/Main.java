package iuh.fit.sv;

import iuh.fit.sv.factory.EmailCreator;
import iuh.fit.sv.factory.NotificationCreator;
import iuh.fit.sv.factory.PushCreator;
import iuh.fit.sv.factory.SmsCreator;
import iuh.fit.sv.singleton.AppLogger;

public class Main {
    public static void main(String[] args) {
        // Singleton
        AppLogger logger1 = AppLogger.getInstance();
        AppLogger logger2 = AppLogger.getInstance();
        System.out.println("Cùng 1 instance? " + (logger1 == logger2)); // true

        //Factory method
        System.out.println("\n--- Factory Method");
        NotificationCreator creator;

        creator = new EmailCreator();
        creator.notify("phanphuochiep2004@email.com", "Chào Hiệp!");

        creator = new SmsCreator();
        creator.notify("0909123999", "Mã OTP: 1234");

        creator = new PushCreator();
        creator.notify("device_token_abc", "Bạn có tin nhắn mới!");
    }
}