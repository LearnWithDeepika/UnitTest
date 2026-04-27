package org.example.service;

public class EmployeeService {
    public double yearlySalary(double salary){
        return salary*12;
    }
    public double calculateHike(double salary){
        return salary+ (salary*0.10);
    }
}
