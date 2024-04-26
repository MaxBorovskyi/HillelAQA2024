package org.example.HW8.Aircrafts;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("F14 Tomcat", 10000000);
        airplane.fly();
        airplane.attack();

        Helicopter helicopter = new Helicopter("AH-64 Apache", 100000);
        helicopter.fly();
        helicopter.attack();

        Aerostat aerostat = new Aerostat("Aerostat5000", 10000);
        aerostat.fly();
    }
}
