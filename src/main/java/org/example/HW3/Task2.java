package org.example.HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double productPrice = scanner.nextDouble();

        // Input quantity of the product
        System.out.print("Enter the quantity of the product: ");
        int quantity = scanner.nextInt();

        // Calculate the total cost of the product
        double totalCost;
        if (quantity > 80) {
            totalCost = quantity * productPrice * (1 - 0.13);
        } else if (quantity > 30) {
            double additionalDiscount = Math.floor((quantity - 30) / 10) * 0.004;
            totalCost = quantity * productPrice * (1 - (0.12 + additionalDiscount));
        } else if (quantity > 20) {
            totalCost = quantity * productPrice * (1 - 0.10);
        } else if (quantity > 10) {
            totalCost = quantity * productPrice * (1 - 0.05);
        } else {
            totalCost = quantity * productPrice;
        }

        System.out.println("Total product cost: " + totalCost);
    }
}

