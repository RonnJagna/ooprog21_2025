import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;    
        final double RATE = 0.03; 
        int year = 0;            
        int response;            

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        response = input.nextInt();

        while (response == 1) {
            year++;
            balance = balance + (balance * RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", year, RATE, balance);

            System.out.print("\nDo you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            response = input.nextInt();
        }

        input.close();
    }
}
