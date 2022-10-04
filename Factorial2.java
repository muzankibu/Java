import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your number:");
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.printf("The factorial of "+n+" is: "+result);
        sc.close();
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
