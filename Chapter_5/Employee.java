// Employee.java
// Model class without rate limit (matches screenshot output)

public class Employee {
    private int employeeNumber;
    private double payRate;
    private final int MAX_EMPLOYEE_NUMBER = 9999;
    private final double OVERTIME_MULTIPLIER = 1.5;

    // Constructor
    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            System.out.println("⚠️ Employee number exceeds maximum (" + MAX_EMPLOYEE_NUMBER + "). Adjusted to " + MAX_EMPLOYEE_NUMBER + ".");
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        } else {
            this.employeeNumber = employeeNumber;
        }

        // Removed rate cap
        this.payRate = payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;
        }
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        } else {
            return 0.0;
        }
    }
}
