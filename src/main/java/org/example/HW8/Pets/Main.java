package org.example.HW8.Pets;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("TomCat", 7);
        cat.voice();

        Dog dog = new Dog("Doggo", 40);
        dog.voice();

        Hamster hamster = new Hamster("Fatty", 1);
        hamster.voice();
    }
}
