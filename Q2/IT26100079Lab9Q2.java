import java.util.Scanner;

public class IT26100079Lab9Q2 {

    // Method to calculate the area of the circle
    public static double circleArea(double radius) {
        // Area = pi * r^2
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Call the circleArea method and store the result
        double calculatedArea = circleArea(radius);

        // Display the result matching the expected format exactly
        System.out.println("The area of the circle with radius " + radius + " is : " + calculatedArea);

        scanner.close();
    }
}