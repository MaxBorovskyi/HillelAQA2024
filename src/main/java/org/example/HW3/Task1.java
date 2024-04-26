package org.example.HW3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        scanner.close();


        //Even/Odd Parity Check
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is odd");
        }


        //Positive/negative check
        if (number > 0) {
            System.out.println("Number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative");
        } else {
            System.out.println("Number " + number + " is null");
        }


        //Primality/composite check
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Number " + number + " is prime");
        } else {
            System.out.println("Number " + number + " is composite");
        }
    }
}
