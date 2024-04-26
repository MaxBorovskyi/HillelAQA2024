package org.example.HW8.Fishes;

public class Carp extends Fish {
    public Carp(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println(name + " swims!");
    }
}
