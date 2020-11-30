package com.example.paymentservice.Payment;

public class Payment {
    private final int payment;
    private final String name;
    private final int orderId;

    public Payment(int payment, String name, int orderId) {
        this.payment = payment;
        this.name = name;
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getPayment() {
        return payment;
    }
}
