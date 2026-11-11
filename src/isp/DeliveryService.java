package isp;

public class DeliveryService implements DeliveryManager {
    @Override
    public void dispatchDelivery(String orderId) {
        System.out.println("Despachando entrega do pedido: " + orderId);
    }
}