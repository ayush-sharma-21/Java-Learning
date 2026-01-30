package org.example.learning.designPatterns;

public class StrategyDesignPattern {

    public interface PaymentStrategy {
        void pay();
    }

    public static class UpiPayment implements PaymentStrategy {

        @Override
        public void pay() {
            System.out.println("Payment category : UPI");
        }
    }

    public static class CardPayment implements PaymentStrategy {

        @Override
        public void pay() {
            System.out.println("Payment category : CARD");
        }
    }

    public static class PaymentContext {
        private final PaymentStrategy paymentStrategy;

        PaymentContext(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void executePayment() {
            paymentStrategy.pay();
        }
    }

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new UpiPayment());
        paymentContext.executePayment();

        paymentContext = new PaymentContext(new CardPayment());
        paymentContext.executePayment();
    }
}
