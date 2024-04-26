package org.example.HW8.Fishes;

abstract class Fish implements Swimmable {
    protected String name;
    protected String color;

    //constructor
    public Fish(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
