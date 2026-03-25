package com.oop.model;

public abstract class Employee {
    private String name;
    private String Employeeid;
    protected EmployeeType type;

    public enum EmployeeType {
    SALARIED, 
    HOURLY
}

    public Employee(String name, String employeeid,EmployeeType type) {
        this.name = name;
        this.Employeeid = employeeid;
        this.type = type;
    }

    public abstract double calculateEarnings();

    @Override
    public String toString() {
        return "Name:" + name + "Id:" + Employeeid + "Type" + type;

    }
    @Override
    public boolean equals(Object o ){
         if(this == o) return true;
         if(o == null || getClass() != o.getClass()) return false;
         Employee employee = (Employee) o;
         return java.util.Objects.equals(Employeeid, employee.Employeeid);
    }
}
