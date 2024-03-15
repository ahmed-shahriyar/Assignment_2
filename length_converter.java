import java.util.Scanner;

public class length_converter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a measurement in meters
        System.out.print("Enter a measurement in meters: ");
        double meters = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Convert meters to miles, feet, and inches
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        // Print the results
        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);
    }

}
