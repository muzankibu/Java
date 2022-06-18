import java.util.Scanner;


public class Cd6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1;
        String name;
        boolean boole;;
        System.out.printf("Enter your name: ");
        name= input.nextLine();
        System.out.printf("Welcome "+name+"!");
        System.out.printf("\nEnter your number: ");
        n1= input.nextInt();
        System.out.printf("Your number= %d", n1);
        System.out.printf("\nWhats your boolean input: ");
        boole= input.nextBoolean();
        System.out.printf("Your given boolean input: %b",boole);
    }
}
