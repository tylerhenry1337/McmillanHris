package com.FinalProj;

public class PayRoll {
    private double hours;
    private double salary;
    //Default constructor
    public PayRoll(){

    }

    public PayRoll(double salary, double hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public void displayPayRoll(){
        System.out.println("Payroll info\n------------\n" + "Employee annual salary: " + salary + "\n------------\nEmployees hours worked for two weeks " + hours  + "\n------------\n");
    }

}
