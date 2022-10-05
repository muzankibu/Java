import java.lang.Math;
public class RandomNumber {
    public static void main(String[] args) {
        int max=1000;
        int min=9999;
        int x=(int) (Math.random()*(max-min+1)+min);
        double y=Math.random()*(max-min+1)+min;
        System.out.println(x);
        System.out.println(y);
        
    }
}
