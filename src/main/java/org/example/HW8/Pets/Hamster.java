package org.example.HW8.Pets;

public class Hamster extends Pet{
    public Hamster(String name, Integer weight) {
        super(name, weight);
    }

    @Override
    public void voice() {
        System.out.println(name + " arrr!");
    }
}
