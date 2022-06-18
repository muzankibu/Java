import java.util.Scanner;

public class Cd10 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double cels, farn;
            
            System.out.print("Enter Celsisus scaled value=");
            cels=input.nextDouble();
            farn=1.8*cels+32;
            System.out.println("Farenheit : "+farn);
    }
}
