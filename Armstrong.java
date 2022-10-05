import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your number:");
        int n=sc.nextInt();
        int tem=n;
        int tem2=n;
        sc.close();
        int rm;
        int sum=0;
        int digit=0;
        while(tem>0){
            tem=tem/10;
            digit=digit+1;
        }

        while(n>0){
            rm=n%10;
            sum+=(Math.pow(rm,digit));
            n=n/10;
        }
        if(sum==tem2){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        
    }
}
