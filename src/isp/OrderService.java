package isp;

public class OrderService implements OrderManager {
    @Override
    public void createOrder(String orderId) {
        System.out.println("Criando pedido: " + orderId);
    }
}