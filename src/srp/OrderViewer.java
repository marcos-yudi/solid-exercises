package srp;

class OrderViewer {
    public void display(Order order) {
        System.out.println("--- Detalhes do Pedido ---");
        System.out.println("ID: " + order.id());
        System.out.println("Cliente: " + order.customerName());
        System.out.println("Total: R$ " + order.totalAmount());
    }
}