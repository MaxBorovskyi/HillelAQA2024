package org.example.HW8.OtherBirds;

abstract class OtherBirds {
    protected String name;
    protected String location;

    public OtherBirds(String name, String location) {
        this.name = name;
        this.location = location;
    }

    abstract void sound();
}
