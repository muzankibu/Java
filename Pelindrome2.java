import java.util.Scanner;

public class Pelindrome2 {
    public static void main(String[] args) {
        String og,rv="";
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter your word or number:");
        og=sc.next();
        for(int i=og.length()-1;i>=0;i--){
            rv=rv+og.charAt(i);
        }
        if(og.equalsIgnoreCase(rv)){
            System.out.printf("Pelindrome");
        }else{
            System.out.print("Not Pelindrome");
        }
        sc.close();

    }
}
