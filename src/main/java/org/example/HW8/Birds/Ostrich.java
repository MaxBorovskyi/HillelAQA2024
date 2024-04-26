package org.example.HW8.Birds;

public class Ostrich extends Bird implements Swimmable{
    public Ostrich(String name, String location) {
        super(name, location);
    }

    @Override
    void fly() {
        System.out.println(name + " can't fly.");
    }

    @Override
    public void swim() {
        System.out.println(name + "can`t swim");
    }
}
