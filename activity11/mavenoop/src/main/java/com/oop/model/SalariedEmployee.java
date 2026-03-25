package com.oop.model;

public class SalariedEmployee extends Employee {
    private double baseSalary;
    private double bonus;
    public SalariedEmployee(String name, String employeeid, double baseSalary, double bonus) {
        super(name,employeeid,EmployeeType.HOURLY);
        this.baseSalary = baseSalary;
        this.bonus = bonus;

    }
    @Override
    public double calculateEarnings() {
       return baseSalary + bonus;
    }
}

