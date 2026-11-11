package ocp;

class PixPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Pagamento de R$ " + amount + " realizado via PIX.");
    }
}