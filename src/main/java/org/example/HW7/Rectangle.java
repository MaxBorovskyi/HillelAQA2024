package org.example.HW7;

public class Rectangle extends Figures {
    double length;
    double width;

    //constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //method that will calculate area of rectangle
    @Override
    double area() {
        return length * width;
    }

    // Method that will calculate perimeter of rectangle
    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}
