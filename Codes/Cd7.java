
import java.util.Scanner;

public class Cd7 {

    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            double a;
            double b;
            System.out.printf("Enter your first number: ");
            a= inp.nextDouble();
            System.out.printf("Enter your second number: ");
            b= inp.nextDouble();
            System.out.printf("Addition= "+(a+b));
            System.out.printf("\nSubtraction= "+(a-b));
            System.out.printf("\nMultiplication= "+(a*b));
            System.out.printf("\nDivision= "+(a/b));
            System.out.printf("\nRemainder= "+(a%b));
        }


    
}
