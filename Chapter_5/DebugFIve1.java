// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import java.util.*;

public class DebugFive1 {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        final double HIGH_PRICE = 2.59; 
        final double MED_PRICE = 1.99;  
        final double LOW_PRICE = 0.89;  

        int usersChoice;
        double bill = 0.0; // Fixed: initialize bill to 0

        System.out.println("Order please 1 - Burger 2 - Hotdog");
        System.out.print("3 - Grilled cheese 4 - Fish sandwich >> ");
        usersChoice = kb.nextInt();

        // Fixed: use OR (||) instead of AND (&&)
        if(usersChoice == 1 || usersChoice == 2) { // added braces
            bill = bill + HIGH_PRICE;
        } else { // added braces
            bill = bill + MED_PRICE;
        }

        System.out.print("Fries with that? 1 - Yes 2 - No >> ");
        usersChoice = kb.nextInt();

        // Fixed: use == for comparison
        if(usersChoice == 1) { // added braces
            bill = bill + LOW_PRICE;
        }

        // Fixed: add quotes for proper string concatenation
        System.out.println("Total bill is " + bill);
    }
}
