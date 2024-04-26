package org.example.HW8.Pets;

public class Cat extends Pet{
    public Cat(String name, Integer weight) {
        super(name, weight);
    }

    @Override
    public void voice() {
        System.out.println(name + " meow!");
    }
}
