package org.example.learning.designPatterns;

public class DecoratorDesignPattern {

    interface Coffee {
        String description();

        double cost();
    }

    static class SimpleCoffee implements Coffee {

        @Override
        public String description() {
            return "SIMPLE COFFEE";
        }

        @Override
        public double cost() {
            return 10;
        }
    }

    static abstract class CoffeeDecorator implements Coffee {

        protected Coffee coffee;

        CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        @Override
        public String description() {
            return coffee.description();
        }

        @Override
        public double cost() {
            return coffee.cost();
        }
    }

    static class SugarInCoffee extends CoffeeDecorator {

        SugarInCoffee(Coffee coffee) {
            super(coffee);
        }

        @Override
        public String description() {
            return super.description() + ", SUGAR ADDED";
        }

        @Override
        public double cost() {
            return super.cost() + 10;
        }
    }

    static class MilkInCoffee extends CoffeeDecorator {

        MilkInCoffee(Coffee coffee) {
            super(coffee);
        }

        @Override
        public String description() {
            return super.description() + ", MILK ADDED";
        }

        @Override
        public double cost() {
            return super.cost() + 10;
        }
    }

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " - " + coffee.cost());

        coffee = new MilkInCoffee(coffee);
        coffee = new SugarInCoffee(coffee);

        System.out.println(coffee.description() + " - " + coffee.cost());
    }
}
