import java.util.Scanner;

public class CircleAndSphereProperties {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Calculate area and circumference of a circle
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;

        // Calculate volume and surface area of a sphere
        double sphereVolume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * Math.PI * radius * radius;

        // Print the results
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Circumference of the circle: " + circleCircumference);
        System.out.println("Volume of the sphere: " + sphereVolume);
        System.out.println("Surface area of the sphere: " + sphereSurfaceArea);
    }
}