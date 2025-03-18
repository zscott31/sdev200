import java.util.Scanner;

public class MetersToFeetConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value in meters
        System.out.print("Enter the value in meters: ");
        double meters = scanner.nextDouble();

        // Conversion factor: 1 meter = 3.28084 feet
        double feet = meters * 3.28084;

        // Display the result
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}