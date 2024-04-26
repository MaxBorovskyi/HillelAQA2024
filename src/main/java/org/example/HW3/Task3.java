package org.example.HW3;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter hour rate: ");
            int hourRate = scanner.nextInt();

            System.out.print("Enter tax rate %: ");
            int taxRate = scanner.nextInt();


            int workingDays = calculateWorkingDaysInMonth(month);
            double salaryBeforeTax = calculateSalary(hourRate, workingDays);
            double salaryAfterTax = calculateSalaryAfterTax(hourRate, workingDays, taxRate);


            System.out.println("Salary for the month before tax: " + salaryBeforeTax);
            System.out.println("Salary for the month after tax: " + salaryAfterTax);
        }

        // Method to calculate working days in the month
        private static int calculateWorkingDaysInMonth(int month) {
            if (month < 1 || month > 12) {
                return 0;
            }
            switch (month) {
                case 2:
                    return 20;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 22;
                default:
                    return 23;
            }
        }

        private static double calculateSalary(double hourlyRate, int workingDays) {
            final int hoursPerDay = 8;
            return hourlyRate * hoursPerDay * workingDays;
        }

        private static double calculateSalaryAfterTax(double hourlyRate, int workingDays, double taxRate) {
            double salaryBeforeTax = calculateSalary(hourlyRate, workingDays);
            return salaryBeforeTax * (1 - taxRate / 100);
        }
}
