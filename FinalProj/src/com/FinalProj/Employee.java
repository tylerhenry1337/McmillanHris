package com.FinalProj;

public class Employee {
    String firstName;
    String lastName;
    int age;
    int id;

    //Default constructor
    public Employee(){

    }
    //Overloaded constructor
    public Employee(String firstName, String lastName, int age, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;

    }
    //Getter setters for first/last name, age, employee id, salary
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public void displayEmployee(){
        System.out.println("Employee Info\n------------\n" + firstName + " " + lastName + "\n------------\nD " + age  + "\n------------\nEmployee ID " + id + "\n------------\n");
    }





}
