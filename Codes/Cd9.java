import java.util.Scanner;

public class Cd9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        double b,h,area;
        System.out.printf("Enter Base: ");
        b=input.nextDouble();
        System.out.printf("Enter Height: ");
        h= input.nextDouble();
        area=.5*b*h;
        System.out.print("area is: "+area); 
    }
}
