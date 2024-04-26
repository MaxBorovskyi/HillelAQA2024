package org.example.HW7;

public class Circle extends Figures {
    double radius;

    //constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // method that will calculate area of circle
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    // method that will calculate perimeter of circle
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
