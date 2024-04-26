package org.example.HW8.Birds;

public class Penguin extends Bird implements Swimmable{
    public Penguin(String name, String location) {
        super(name, location);
    }

    @Override
    public void fly() {
        System.out.println(name + " can`t fly.");
    }

    @Override
    public void swim() {
        System.out.println(name + " can swim.");
    }
}
