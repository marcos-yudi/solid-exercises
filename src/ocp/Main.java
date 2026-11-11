package ocp;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new CardPayment(), 150.00);
        processor.processPayment(new PixPayment(), 75.50);
        processor.processPayment(new CashPayment(), 50.00);
    }
}