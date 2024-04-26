package org.example.HW8.Transport;

public class Tractor extends Transport implements Drivable{
    public Tractor(String model, int price) {
        super(model, price);
    }

    @Override
    void startEngine() {
        System.out.println(model + "`s engine has started");
    }

    @Override
    public void drive() {
        System.out.println(model + " is driven by driver");
    }
}
