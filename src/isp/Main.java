package isp;

public class Main {
    public static void main(String[] args) {
        OrderManager orderService = new OrderService();
        DeliveryManager deliveryService = new DeliveryService();
        NotificationSender notificationService = new EmailService();
        ReportGenerator reportService = new FinancialReportService();

        orderService.createOrder("9982");
        deliveryService.dispatchDelivery("9982");
        notificationService.sendNotification("Seu pedido saiu para entrega!");
        reportService.generateReport();
    }
}