import java.util.Scanner;

public class PrimeNumber2{
    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your initial number:");
        int num1=sc.nextInt();
        System.out.printf("Enter your last number:");
        int num2= sc.nextInt();
       if(num1==0||num2==0||num1==1||num2==1||num1<0||num2<0){
        System.out.println("0,1 and Nagetive numbers are not accepted!");
       }else{
        if(num1<num2){
            for(int i=num1;i<=num2;i++){   
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        flag=1;
                        break;
                    }
                
                } if(flag==0){
                    System.out.println(i+" is Prime");
                }else{
                    System.out.println(i+" is Not Prime");   
                }
               flag=0; 
            }
           }else{
            System.out.println("Intitial Number<Last Number!");
           }
       }
        sc.close();
    }
}


