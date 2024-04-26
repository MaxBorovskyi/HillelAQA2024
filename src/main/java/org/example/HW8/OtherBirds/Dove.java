package org.example.HW8.OtherBirds;

class Dove extends OtherBirds implements Flyable {
    public Dove(String name, String location) {
        super(name, location);
    }

    @Override
    void sound() {
        System.out.println(name + " makes a gentle cooing sound.");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies gracefully.");
    }
}
