import java.util.Scanner;

public class DebugFive3 {
    public static void main(String args[]) {
        int item;
        String output;

        final int LOW = 111;
        final int HIGH = 999;
        final int CUTOFF = 500;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter item number >> ");
        item = input.nextInt();

        // Fixed: check if item is too low
        if(item < LOW) { // Added braces
            output = "Item number too low";
        } 
        // Fixed: check if item is too high (corrected typo HIGHH → HIGH)
        else if(item > HIGH) { // Added braces
            output = "Item number too high";
        } 
        // Fixed: valid items less than cutoff → Automotive
        else if(item < CUTOFF) { // Added braces
            output = "Valid - Item in Automotive Department";
        } 
        // Fixed: valid items >= cutoff → Housewares
        else { // Added braces
            output = "Valid - Item in Housewares Department";
        }

        System.out.println(output);
    }
}
