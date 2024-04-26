package org.example.HW6;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    //constructor:
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //getters and setters
    private int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    private int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    private int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    //method that will calculate perimeter:
    public int calculatePerimeter() {
        return side1 + side2 + side3;
    }

    //method that will calculate the area of a triangle:
    //использовал формулуГерона для расчета площади треугольника:
    public double calculateArea() {
        double s = calculatePerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }
