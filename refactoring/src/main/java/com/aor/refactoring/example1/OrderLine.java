package com.aor.refactoring.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.setProduct(product);
        this.setQuantity(quantity);
    }

    public double getTotal() {
        return this.getProduct().getPrice() * this.getQuantity();
    }

    public String getString() {
        return this.getProduct().getName() + "(x" + this.getQuantity() + "): " + this.getTotal() + "\n";
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
