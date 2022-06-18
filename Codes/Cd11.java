import java.util.Scanner;

public class Cd11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.printf("Enter your number: ");
        x = input.nextInt();
        y = +x;//unary plus
        
        System.out.println("Print the result : "+y);
        y = -x;//unary minus
        System.out.println("Print the result : "+y);
        y = ++x;//pre increment
        System.out.println("Print the result : "+y);
        y = --x;//pre decrement
        System.out.println("Print the result : "+y);
        y = x++;//post increment
        System.out.println("Print the result : "+y);
        y = x--;//post decrement
        System.out.println("Print the result : "+y);
    }
}
