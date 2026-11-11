import srp.Order;
import srp.OrderRepository;
import srp.OrderViewer;

public static void main(String[] args) {
    Order order = new Order("001", "Maria Silva", 154.90);

    OrderRepository repository = new OrderRepository();
    repository.save(order);

    OrderViewer viewer = new OrderViewer();
    viewer.display(order);
}
