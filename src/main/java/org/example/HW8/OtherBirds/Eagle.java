package org.example.HW8.OtherBirds;

public class Eagle extends OtherBirds implements Flyable{
    public Eagle(String name, String location) {
        super(name, location);
    }

    @Override
    void sound() {
        System.out.println(name + " makes a loud screech.");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies perfectly.");
    }
}
