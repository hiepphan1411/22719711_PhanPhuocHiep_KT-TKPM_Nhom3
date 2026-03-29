package iuh.fit.theodoicongviec;

public class TeamMember implements TaskObserver {
    private String name;
    public TeamMember(String name) { this.name = name; }

    @Override
    public void onTaskUpdated(String taskName, String status) {
        System.out.println("  [" + name + "] Task '" + taskName + "' chuyển sang: " + status);
    }
}
