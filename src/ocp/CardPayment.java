package ocp;

class CardPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Pagamento de R$ " + amount + " realizado via Cartão.");
    }
}