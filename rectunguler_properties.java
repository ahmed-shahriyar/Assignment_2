import java.util.Scanner;

public class rectunguler_properties {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the rectangle's sides
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Calculate the area and perimeter of the rectangle
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Calculate the length of the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(length * length + width * width);

        // Print the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}
