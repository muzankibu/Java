import java.util.Scanner;

public class Pelindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter your number:");
        int x=sc.nextInt();
         int temp=x;
        int rm,sum=0;
        while(x>0){
            rm=x%10;
            sum=(sum*10)+rm;
            x=x/10;
        }
        if(temp==sum){
            System.out.printf("Pelindrome");
        }else{
            System.out.printf("Not Pelindrome");
        }
        sc.close();
    }
}
