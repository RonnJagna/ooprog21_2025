// Payroll.java
// Main program that asks for employee number, hours, and rate, then computes pay.
// Displays warning messages if limits are exceeded.

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number >> ");
        int empNumber = input.nextInt();

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        // Create an Employee object
        Employee emp = new Employee(empNumber, rate);

        // Compute pay
        double regularPay = emp.calculateRegularPay(hoursWorked);
        double overtimePay = emp.calculateOvertimePay(hoursWorked);

        // Display results
        System.out.println("\nEmployee #" + emp.getEmployeeNumber());
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        input.close();
    }
}
