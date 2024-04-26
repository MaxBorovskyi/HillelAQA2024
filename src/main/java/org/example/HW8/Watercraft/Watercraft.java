package org.example.HW8.Watercraft;

public abstract class Watercraft {
    protected String model;
    protected int waterCapacity;

    public Watercraft(String model, int waterCapacity) {
        this.model = model;
        this.waterCapacity = waterCapacity;
    }

    abstract void start ();
}
