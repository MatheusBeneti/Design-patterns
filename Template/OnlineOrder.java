package org.example;


class OnlineOrder extends OrderTemplate {
    protected double calculateTotal(int itemCount, double itemValue) {
        return itemCount * itemValue;
    }

    protected String processPayment(double total, String paymentMethod) {
        if (paymentMethod.equals("cryptocurrency")) {
            return "Payment of " + total + " processed via cryptocurrency.";
        } else {
            return "Payment of " + total + " processed online.";
        }
    }

    protected String decideDelivery(String paymentMethod) {
        if (paymentMethod.equals("cryptocurrency")) {
            return "Immediate online delivery.";
        } else {
            return "Online delivery after payment confirmation.";
        }
    }
}
