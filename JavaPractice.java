import java.util.Scanner;

// Create a separate class for calculating the area
class AnotherClass {
    // Method to calculate the area given the base and height
    public double getArea(double base, double height) {
        return 0.5 * base * height; // Calculate the area using the formula
    }
}

public class JavaPractice {
    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass(); // Create an instance of AnotherClass

        // Create a Scanner object to read input from the user
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Base: ");
            double base = in.nextDouble(); // Read the base value from the user

            System.out.println("Enter Height: ");
            double height = in.nextDouble(); // Read the height value from the user

            // Call the getArea() method on the AnotherClass object to calculate the area
            double area = obj.getArea(base, height);

            System.out.println("The area is " + area); // Print the calculated area
        }
    }
}
                      