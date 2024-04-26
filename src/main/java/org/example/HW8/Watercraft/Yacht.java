package org.example.HW8.Watercraft;

public class Yacht extends Watercraft implements Floatable{
    public Yacht(String model, int waterCapacity) {
        super(model, waterCapacity);
    }

    @Override
    void start() {
        System.out.println(model + " has started");
    }

    @Override
    public void move() {
        System.out.println(model + " is moving on water");
    }
}
