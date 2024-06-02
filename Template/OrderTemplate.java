package org.example;

abstract class OrderTemplate {
    public final String processOrder(int itemCount, double itemValue, String paymentMethod) {
        double total = calculateTotal(itemCount, itemValue);
        String paymentProcessed = processPayment(total, paymentMethod);
        String delivery = decideDelivery(paymentMethod);

        return "Total: " + total + ", Payment Processed: " + paymentProcessed + ", Delivery: " + delivery;
    }

    protected abstract double calculateTotal(int itemCount, double itemValue);

    protected abstract String processPayment(double total, String paymentMethod);

    protected abstract String decideDelivery(String paymentMethod);
}

