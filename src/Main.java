//Import the Scanner Class:
import java.util.Scanner;

public class Main {
    //Define the Main Method:
    public static void main(String[] args) {

        //Initialize Scanner for User Input:
        Scanner scanner = new Scanner(System.in);

        //Prompt the User for a Year:
        System.out.println("Enter the year: ");

        //Read the User's Input:
        int year = scanner.nextInt();

        //Implement Leap Year Logic:
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            //Display the Result:
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        //Close the Scanner:
        scanner.close();
    }
}