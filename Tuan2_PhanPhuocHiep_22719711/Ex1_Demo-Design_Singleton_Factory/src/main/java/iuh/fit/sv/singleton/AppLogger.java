package iuh.fit.sv.singleton;

public class AppLogger {
    private static volatile AppLogger instance;

    private AppLogger() {};

    public static AppLogger getInstance() {
        if (instance == null) {
            synchronized (AppLogger.class) {
                if (instance == null) {
                    instance = new AppLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}