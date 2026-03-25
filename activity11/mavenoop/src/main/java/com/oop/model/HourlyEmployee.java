package com.oop.model;

public class HourlyEmployee extends Employee {
    
    private int hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, String employeeid,int hoursWorked, double hourlyRate) {
        super(name,employeeid,EmployeeType.HOURLY);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }
    @Override
    public double calculateEarnings() {
        return hoursWorked * hourlyRate;
    }
}
