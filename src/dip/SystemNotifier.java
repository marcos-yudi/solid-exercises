package dip;

public class SystemNotifier {
    private final NotificationService notificationService;

    public SystemNotifier(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.send(message);
    }
}