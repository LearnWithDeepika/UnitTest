package org.example;

import org.example.pojo.Employee;
import org.example.service.EmployeeService;
import org.example.test.EmployeeServiceTest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee Employee1= new Employee("Jack",101,8000);
        Employee Employee2= new Employee("John" ,102,100000);

        double Employee1_salary_expected=8000*12;
        double Employee1_salary_hike_expected=8000+(8000*0.10);
        EmployeeServiceTest test=new EmployeeServiceTest();
        EmployeeService actualService=new EmployeeService();
        test.testEmployeeService(actualService.yearlySalary(Employee1.salary()),Employee1_salary_expected,"Jack Yearly service");
        test.testEmployeeService(actualService.calculateHike(Employee1.salary()),Employee1_salary_hike_expected,"Jack Hike service");
    }


}