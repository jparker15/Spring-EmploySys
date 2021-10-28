package com.atsignJar.EmployeeSys;

public class Employee {
    private final long id;
    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName, long id){
        this.firstName  = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    public long getId(){return id;}

    public String getName(){return firstName + " " + lastName;}
}
