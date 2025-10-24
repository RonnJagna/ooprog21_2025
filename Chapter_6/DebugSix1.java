// Start with a penny
// Double it every day
// How much do you have in X number of days?

import java.util.Scanner;

class DebugSix1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01; 
        int day = 1;

        // Added semicolon at the end of the line
        System.out.print("Enter number of days >> ");
        days = keyboard.nextInt();

        //Reversed the condition to while(day <= days)
        while (day <= days) {

            // Changed 'days' to 'day'
            System.out.println("After day " + day +
                    ", you have $" + String.format("%.2f", money));

            money = money * 2;
            ++day; 
        }

        
        keyboard.close();
    }
}
