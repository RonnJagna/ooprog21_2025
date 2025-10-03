import java.util.*;

public class DebugFive4 {
    public static void main(String args[]) {
        int one, two, three, four;
        int highest;

        Scanner input = new Scanner(System.in);

        // Fixed: assign each input to correct variable
        System.out.print("Enter an integer >> ");
        one = input.nextInt();

        System.out.print("Enter an integer >> ");
        two = input.nextInt();

        System.out.print("Enter an integer >> ");
        three = input.nextInt();

        System.out.print("Enter an integer >> ");
        four = input.nextInt();

        // Fixed: logical comparisons with AND (&&) for all numbers
        if(one > two && one > three && one > four) { // Added braces
            highest = one;
        } else if(two > one && two > three && two > four) { // Added braces
            highest = two;
        } else if(three > one && three > two && three > four) { // Added braces
            highest = three;
        } else { // Added braces
            highest = four;
        }

        System.out.println("The highest number is " + highest);
    }
}
