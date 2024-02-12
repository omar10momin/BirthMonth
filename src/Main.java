import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Create a new Scanner object

        System.out.print("Enter your birth month (1-12): ");  // Print a prompt asking for birth month
        int month = in.nextInt();  // Read the user input as an integer representing the birth month

        // Check if the entered month is within the range of 1-12
        if (month >= 1 && month <= 12) {
            System.out.println("Your birth month is: " + month);  // Print the user's birth month
        } else {
            System.out.println("You entered an incorrect month value: " + month);  // Print an error message
        }

        in.close();  // Close the Scanner object to release resources
    }
}
