package org.example.learning.designPatterns;

public class FactoryDesignPattern {

    interface PaymentProcessor {
        public void pay();
    }

    static class UpiPayment implements PaymentProcessor {
        @Override
        public void pay() {
            System.out.println("UPI");
        }
    }

    static class CardPayments implements PaymentProcessor {
        @Override
        public void pay() {
            System.out.println("CARD");
        }
    }

    static class PaymentFactory {
        public static PaymentProcessor paymentProcessor(String type) {
            if (type.equalsIgnoreCase("UPI"))
                return new UpiPayment();
            else if (type.equalsIgnoreCase("CARD"))
                return new CardPayments();
            else
                throw new IllegalStateException("Unexpected value: " + type.toUpperCase());
        }
    }

    public static void main(String[] args) {
        System.out.println(PaymentFactory.paymentProcessor("CARD").getClass());
    }
}
