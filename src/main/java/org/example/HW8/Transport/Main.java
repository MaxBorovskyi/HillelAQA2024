package org.example.HW8.Transport;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lexus", 100000);
        car.startEngine();
        car.drive();

        Bus bus = new Bus("Icarus", 5000);
        bus.startEngine();
        bus.drive();

        Tractor tractor = new Tractor("Tractor3000", 3000);
        tractor.startEngine();
        tractor.drive();
    }
}
