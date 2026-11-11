package lsp;

class Bebida implements Product {
    @Override
    public String getName() {
        return "Suco de Laranja";
    }

    @Override
    public double getPrice() {
        return 12.00;
    }

    @Override
    public void prepare() {
        System.out.println("Servindo a bebida no copo com gelo.");
    }
}