package lsp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> order = List.of(new Pizza(), new Hamburguer(), new Bebida());

        double total = 0;
        for (Product product : order) {
            System.out.println("Item: " + product.getName() + " - R$ " + product.getPrice());
            product.prepare();
            total += product.getPrice();
        }

        System.out.println("Total do pedido: R$ " + total);
    }
}