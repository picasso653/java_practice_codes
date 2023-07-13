import java.util.Scanner;

class AnotherClass {
    public double getArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class JavaPractice {
    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Base: ");
            double base = in.nextDouble();
            System.out.println("Enter Height: ");
            double height = in.nextDouble();
            System.out.println("The area is " + obj.getArea(base, height));
        }
    }
}
