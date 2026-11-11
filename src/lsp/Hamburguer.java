package lsp;

class Hamburguer implements Product {
    @Override
    public String getName() {
        return "X-Bacon";
    }

    @Override
    public double getPrice() {
        return 28.50;
    }

    @Override
    public void prepare() {
        System.out.println("Grelhando o hambúrguer e montando o pão.");
    }
}