package dip;

public class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Enviando E-mail: " + message);
    }
}