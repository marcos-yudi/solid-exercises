package dip;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailNotification();
        SystemNotifier emailNotifier = new SystemNotifier(email);
        emailNotifier.notifyUser("Seu pedido foi recebido.");

        NotificationService sms = new SmsNotification();
        SystemNotifier smsNotifier = new SystemNotifier(sms);
        smsNotifier.notifyUser("Seu pedido saiu para entrega.");

        NotificationService whatsapp = new WhatsAppNotification();
        SystemNotifier whatsappNotifier = new SystemNotifier(whatsapp);
        whatsappNotifier.notifyUser("Seu pedido foi entregue com sucesso!");
    }
}