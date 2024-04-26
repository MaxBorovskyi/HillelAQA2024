package org.example.HW8.OtherBirds;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle", "Mountains");
        eagle.sound();
        eagle.fly();

        Stork stork = new Stork("Stork", "Wetlands");
        stork.sound();

        Dove dove = new Dove("Dove", "Forests");
        dove.sound();
        dove.fly();
    }
}
