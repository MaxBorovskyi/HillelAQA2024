package org.example.HW8.Transport;

public class Car extends Transport implements Drivable{
    public Car(String model, int price) {
        super(model, price);
    }

    @Override
    void startEngine () {
        System.out.println(model + "`s engine has started");
    }

    @Override
    public void drive() {
        System.out.println(model + " is driven by driver");
    }
}
