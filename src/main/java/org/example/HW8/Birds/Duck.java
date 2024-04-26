package org.example.HW8.Birds;

public class Duck extends Bird implements Swimmable {
    public Duck(String name, String location) {
        super(name, location);
    }

    @Override
    void fly() {
        System.out.println(name + " can fly.");
    }

    @Override
    public void swim() {
        System.out.println(name + " can swim.");
    }
}
