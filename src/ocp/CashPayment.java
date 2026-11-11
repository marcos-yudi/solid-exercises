package ocp;

class CashPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Pagamento de R$ " + amount + " realizado em Dinheiro.");
    }
}