package org.example.HW2;

public class Salaries {
    public static void main(String[] args) {

        int hoursPerWeek = 40;
        int hourlyRate = 10;
        int taxRate = 10;

        int monthlySalaryWithoutTax = hoursPerWeek * hourlyRate * 4;

        int taxAmount = (monthlySalaryWithoutTax * taxRate) / 100;

        int monthlySalaryWithTax = monthlySalaryWithoutTax - taxAmount;

        int yearlySalaryWithoutTax = monthlySalaryWithoutTax * 12;

        int yearlySalaryWithTax = monthlySalaryWithTax * 12;

        System.out.println("Salary per month without tax: " + monthlySalaryWithoutTax);
        System.out.println("Salary per month with tax " + monthlySalaryWithTax);
        System.out.println("Salary per year without tax: " + yearlySalaryWithoutTax);
        System.out.println("Salary per year with tax: " + yearlySalaryWithTax);
    }
}