package isp;

public class EmailService implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}