package iuh.fit.theodoicongviec;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Chạy deadline môn kiến trúc và thiết kế phần mềm");

        task.register(new TeamMember("Phước"));
        task.register(new TeamMember("Hiệp"));
        task.register(new EmailNotifier());

        task.setStatus("IN_PROGRESS");
        task.setStatus("DONE");
    }
}