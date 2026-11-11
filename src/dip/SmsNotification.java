package dip;

public class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}