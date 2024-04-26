package org.example.HW8.Transport;

public abstract class Transport {
    protected String model;
    protected int Price;

    public Transport(String model, int price) {
        this.model = model;
        this.Price = price;
    }

    abstract void startEngine();
}
