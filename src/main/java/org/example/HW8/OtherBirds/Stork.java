package org.example.HW8.OtherBirds;

class Stork extends OtherBirds {
    public Stork(String name, String location) {
        super(name, location);
    }

    @Override
    void sound() {
        System.out.println(name + " makes a clattering noise");
    }
}

