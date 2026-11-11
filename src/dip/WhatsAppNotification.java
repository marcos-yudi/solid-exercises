package dip;

public class WhatsAppNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Enviando WhatsApp: " + message);
    }
}