package org.example.HW7;

public class Main {
    public static void main(String[] args) {

        //creating circle object
        Circle circle = new Circle(10);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        //creating triangle object
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        //creating rectangle object
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle area: " + rectangle.perimeter());
    }
}
