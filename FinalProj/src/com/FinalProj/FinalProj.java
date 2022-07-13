package com.FinalProj;
//HRIS v0.00 just messing around with the concept


import java.util.Scanner;

public class FinalProj {
    //Driver
    public static void main(String args[]){
        Login user = new Login();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to McMillan & Son human resources information system");
        System.out.println("Please enter your username");
        String nameInput = sc.nextLine();
        System.out.println("Please enter you password");
        String passInput = sc.nextLine();


        System.out.println("Enter employee's first name: ");
        String input = sc.nextLine();
        System.out.println("Enter employee's last name: ");
        String input2 = sc.nextLine();
        System.out.println("Enter employee's DOB: ");
        int input3 = sc.nextInt();
        System.out.println("Enter employee's Employee ID: ");
        int input4 = sc.nextInt();
        Employee employee = new Employee(input, input2, input3, input4);
        System.out.println("Enter employee's annual salary: ");
        double input5 = sc.nextDouble();
        System.out.println("Enter employee's total hours worked for two weeks: ");
        double input6 = sc.nextDouble();
        PayRoll payRoll = new PayRoll(input5,input6);

        employee.displayEmployee();
        payRoll.displayPayRoll();


    }

}
