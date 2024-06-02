package org.example;

class InStoreOrder extends OrderTemplate {
    protected double calculateTotal(int itemCount, double itemValue) {
        return itemCount * itemValue;
    }

    protected String processPayment(double total, String paymentMethod) {
        return "Payment of " + total + " processed in-store.";
    }

    protected String decideDelivery(String paymentMethod) {
        return "In-store pickup.";
    }
}
