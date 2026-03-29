package iuh.fit.theodoicongviec;

public class EmailNotifier implements TaskObserver {
    @Override
    public void onTaskUpdated(String taskName, String status) {
        System.out.println("  [Email] Gửi thông báo: Task '" + taskName + "' → " + status);
    }
}
