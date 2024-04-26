package org.example.HW2;

public class HourRate {
    public static void main(String[] args) {

        int hoursPerWeek = 40;
        int yearlySalaryWithTax = 40000;
        int taxRate = 10;

        int monthlySalaryWithTax = yearlySalaryWithTax / 12;
        int monthlySalaryWithoutTax = monthlySalaryWithTax / (1 + (taxRate / 100));
        int hourlyRateWithoutTax = monthlySalaryWithoutTax / (4 * hoursPerWeek);

        System.out.println("At " + hoursPerWeek + " working hours per week with an annual salary of " + yearlySalaryWithTax +
                " and tax of " + taxRate + "%, an hour of time costs " + hourlyRateWithoutTax);
    }
}
