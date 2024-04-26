package org.example.HW6;

public class Employee {
    private String surname;
    private String name;
    private String position;
    private double salaryPerHour;

    //constructor
    public Employee(String surname, String name, String position, Double salaryPerHour) {
        this.surname = surname;
        this.name = name;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    //getters and setters for each variable:
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition() {
        this.position = position;
    }

    public Double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double calculateSalary(double hoursWorked) {
        return hoursWorked * salaryPerHour;
    }
}
