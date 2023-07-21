import java.util.Scanner;

public class DontPushNegative {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int k;
            System.out.println("Enter a pistive number: ");
            k = s.nextInt();
            while (k != 0){
                if (k < 1){
                    break;
                }
                System.out.print("Enter a positive number: ");
                k = s.nextInt();
            
        }
        }
    }

    
}
