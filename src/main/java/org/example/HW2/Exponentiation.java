package org.example.HW2;

public class Exponentiation {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("2 cubed is equal to: " + result);
    }

}