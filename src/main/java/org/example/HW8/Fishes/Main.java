package org.example.HW8.Fishes;

public class Main {
    public static void main(String[] args) {
        Pike pike = new Pike("Pike", "green");
        pike.swim();

        Carp carp = new Carp("Carp", "golden");
        carp.swim();

        Catfish catfish = new Catfish("Catfish", "grey");
        catfish.swim();
    }
}