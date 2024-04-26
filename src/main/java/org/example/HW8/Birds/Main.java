package org.example.HW8.Birds;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin("Penguin", "Antarctica");
        penguin.fly();
        penguin.swim();

        Kiwi kiwi = new Kiwi("Kiwi", "New Zealand");
        kiwi.fly();
        kiwi.swim();

        Ostrich ostrich = new Ostrich("Ostrich", "Africa");
        ostrich.fly();
        kiwi.swim();

        Duck duck = new Duck("Duck", "Pond");
        duck.fly();
        duck.swim();
    }
}
