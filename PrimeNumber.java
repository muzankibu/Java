import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        int flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n=sc.nextInt();
        if(n<0||n==0||n==1){
            System.out.println("Nagetive , 0 And 1 Not Applicable!");
        }
        else if(n==2){
            System.out.println("Prime");
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=0;
                    break;
                }
            }
            if(flag!=0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }

        }
        sc.close();
    }
}