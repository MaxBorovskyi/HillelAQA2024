package org.example.HW7;

class Triangle extends Figures {
    double side1;
    double side2;
    double side3;

    //constructor
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //method that will calculate area of triangle
    @Override
    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //method that will calculate perimeter of triangle
    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}