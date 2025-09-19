public class CompanyInfo {

    //display the company's business hours
    public static void displayHours() {
        System.out.println("Monday - Friday 8am to 6pm");
        System.out.println("Saturday        8am to noon");
        System.out.println("Sunday          closed");
    }

    //display the company name and call the displayHours method
    public static void main(String[] args) {
        System.out.println("Smart Electronic");
        displayHours();
    }
}
