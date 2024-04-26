package org.example.HW8.Watercraft;

public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat("Boat3000", 1000);
        boat.start();
        boat.move();

        Yacht yacht = new Yacht("MegaYacht 5000", 100);
        yacht.start();
        yacht.move();

        Barge barge = new Barge("JustBarge100", 100000);
        barge.start();
        barge.move();
    }
}