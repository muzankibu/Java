import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your number:");
        int n=sc.nextInt();
        sc.close();
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        System.out.printf("The factorial of "+n+" is: "+sum);
    }
}
