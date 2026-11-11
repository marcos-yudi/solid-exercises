package srp;

record Order(String id, String customerName, double totalAmount) {}

class OrderRepository {
    public void save(Order order) {
        System.out.println("Salvando pedido " + order.id() + " no banco de dados...");
    }
}

