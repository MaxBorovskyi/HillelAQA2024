package org.example.HW8.Aircrafts;

public class Aerostat extends Aircraft{
    public Aerostat(String model, int price) {
        super(model, price);
    }

    @Override
    void fly() {
        System.out.println(model + " flies much slower");
    }
}
