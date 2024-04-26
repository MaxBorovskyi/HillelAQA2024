package org.example.HW4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Which shape to display: (rectangle or right triangle or reverse right triangle or triangle)");
            choice = scanner.nextLine();

            switch (choice) {
                case "rectangle":
                    System.out.println("Enter height of the rectangle:");
                    int heightRect = scanner.nextInt();
                    System.out.println("Enter width of the rectangle:");
                    int widthRect = scanner.nextInt();
                    drawRectangle(heightRect, widthRect);
                    break;
                case "right triangle":
                    System.out.println("Enter height of the right triangle:");
                    int heightRightTriangle = scanner.nextInt();
                    drawRightTriangle(heightRightTriangle);
                    break;
                case "reverse right triangle":
                    System.out.println("Enter height of the reverse right triangle:");
                    int heightRevRightTriangle = scanner.nextInt();
                    drawReverseRightTriangle(heightRevRightTriangle);
                    break;
                case "triangle":
                    System.out.println("Enter height of the triangle:");
                    int heightTriangle = scanner.nextInt();
                    drawTriangle(heightTriangle);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            scanner.nextLine();
            System.out.println("Do you want to draw another shape? (yes or no)");
            choice = scanner.nextLine();
        } while (!choice.equals("no"));

        scanner.close();
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawRightTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawReverseRightTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

