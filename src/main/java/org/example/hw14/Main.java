package org.example.hw14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients a, b and c for the quadratic equation:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double[] roots = equation.solve();

        System.out.println("The equation " + a + "x^2 + " + b + "x + " + c + " = 0 has roots:");
        for (double root : roots) {
            System.out.println("x = " + root);
        }
    }
}
