package org.example.HW8.Pets;

public class Dog extends Pet{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    @Override
    public void voice() {
        System.out.println(name + " woof!");
    }
}
