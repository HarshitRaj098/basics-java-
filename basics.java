import java.util.Scanner;

public class Main {

    // Function to take an integer input and print it
    public static void printNumber() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();            // Read integer input
        System.out.println("You entered: " + number); // Print the input
        scanner.close();                           // Close the Scanner
    }

    public static void main(String[] args) {
        printNumber(); // Call the function
    }
}
