package org.example.HW8.Aircrafts;

public class Helicopter extends Aircraft implements Attacks{
    public Helicopter(String model, int price) {
        super(model, price);
    }

    @Override
    void fly() {
        System.out.println(model + " flies a little bit slower");
    }

    @Override
    public void attack() {
        System.out.println(model + " attacks with machine gun");
    }
}
