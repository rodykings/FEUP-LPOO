package com.aor.refactoring.example3;

public class SimpleOrder {
    private Discount discount = new NullDiscount();
    private double price;

    public SimpleOrder(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getTotal() {
            return discount.applyDiscount(price);
    }
}
