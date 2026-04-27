package org.example.test;

public class EmployeeServiceTest {

    public void testEmployeeService(double actualValue, double expectedValue, String validationName) {
        System.out.println("actualValue :"+actualValue);
                System.out.println("expectedValue :"+expectedValue);
        if (actualValue == expectedValue) {
            System.out.println(validationName + " : PASS");
        } else {
            System.out.println(validationName +" : FAIL ");
        }
    }
}
