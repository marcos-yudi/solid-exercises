package lsp;

class Pizza implements Product {
    @Override
    public String getName() {
        return "Pizza de Calabresa";
    }

    @Override
    public double getPrice() {
        return 45.90;
    }

    @Override
    public void prepare() {
        System.out.println("Assando a pizza no forno a lenha.");
    }
}