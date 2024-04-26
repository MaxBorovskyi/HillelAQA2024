package org.example.HW8.Aircrafts;

public class Airplane extends Aircraft implements Attacks{
    public Airplane(String model, int price) {
        super(model, price);
    }

    @Override
    void fly() {
        System.out.println(model + " flies very fast");
    }

    @Override
    public void attack() {
        System.out.println(model + " attacks with rockets");
    }
}
