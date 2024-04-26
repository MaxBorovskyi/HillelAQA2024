package org.example.HW8.Fishes;

public class Catfish extends Fish{
    public Catfish(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println(name + " swims!");
    }
}
