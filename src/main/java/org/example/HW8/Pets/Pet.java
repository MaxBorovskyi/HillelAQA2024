package org.example.HW8.Pets;

abstract class Pet implements Voice{
    protected String name;
    protected Integer weight;

    //constructor
    public Pet (String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }
}
