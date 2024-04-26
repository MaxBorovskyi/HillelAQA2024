package org.example.HW8.Birds;

public abstract class Bird implements Swimmable{
    protected String name;
    protected String location;

    public Bird(String name, String location) {
        this.name = name;
        this.location = location;
    }
    abstract void fly();
}
