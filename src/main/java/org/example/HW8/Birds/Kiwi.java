package org.example.HW8.Birds;

public class Kiwi extends Bird implements Swimmable{
    public Kiwi(String name, String location) {
        super(name, location);
    }

    @Override
    void fly() {
        System.out.println(name + " can't fly.");
    }

    @Override
    public void swim() {
        System.out.println(name + "can swim");
    }
}
