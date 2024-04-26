package org.example.HW8.Aircrafts;

public abstract class Aircraft {
    protected String model;
    protected int price;

    public Aircraft(String model, int price) {
        this.model = model;
        this.price = price;
    }

    abstract void fly();
}
