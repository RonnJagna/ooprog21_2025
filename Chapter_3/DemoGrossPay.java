public class DemoGrossPay {

    public static void calculateGross(double hoursWorked) {
        double hourlyRate = 22.75; 
        double grossPay = hoursWorked * hourlyRate; 
        System.out.printf("%.1f hours at $%.2f per hour is $%.3f\n", hoursWorked, hourlyRate, grossPay);
    }

    public static void main(String[] args) {
        calculateGross(10.0);  
        calculateGross(25.0);  
        calculateGross(37.5);  
    }
}
