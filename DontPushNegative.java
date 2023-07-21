import java.util.Scanner;

public class DontPushNegative {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a positive number: ");
            int k = s.nextInt();
            if (k < 0){
                System.out.println("Don't enter a negative number");
            }
        }
    }

    
}
