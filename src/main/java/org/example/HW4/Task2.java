package org.example.HW4;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers with spaces:");
        String input = scanner.nextLine();
        String[] numbersStr = input.split("\\s+");

        Integer[] numbers = new Integer[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        System.out.println("Base array:");
        printArray(numbers);

        Arrays.sort(numbers);
        System.out.println("Ascending:");
        printArray(numbers);

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending:");
        printArray(numbers);

        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0, j = numbers.length - 1; i <= j; i++, j--) {
            if (i == j) {
                sortedList.add(numbers[i]);
            } else {
                sortedList.add(numbers[j]);
                sortedList.add(numbers[i]);
            }
        }
        System.out.println("Largest in the middle, smallest at the edges):");
        sortedList.forEach(System.out::println);
    }

    public static void printArray(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
