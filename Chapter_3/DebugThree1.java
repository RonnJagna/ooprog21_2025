import java.util.Scanner;

public class DebugThree1 {

    public static void main(String args[]) {
        double check1;
        double check2;
        
        Scanner input = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  // Changed nextInt() to nextDouble()
        
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  // Fixed from inputnextInt() to input.nextDouble()
        
        calcTip(check1);  // Pass check1 as argument to calcTip (method now takes parameter)
        calcTip(check2);  
        
        input.close();    // Close scanner to prevent resource leak
    }

    // Added parameter 'double bill' so method can accept check amount
    public static void calcTip(double bill) {
        final double RATE = 0.15;  // Fixed typo: changed 'doubel' to 'double'
        
        // Corrected calculation: tip should be bill * RATE (not bill / RATE)
        double tip = bill * RATE;
        
        // Added bill amount in output and formatted message
        System.out.println("The tip for a bill of $" + bill + " should be at least $" + tip);
    }
}
