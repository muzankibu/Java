import java.util.Random;
public class RandomNumber2 {
    public static void main(String[] args) {
        Random a=new Random();
        System.out.println(a.nextInt(90,99));
        System.out.println(a.nextDouble());
        System.out.println(a.nextDouble(0.12,0.14));
        System.out.println(a.nextBoolean());
        System.out.println(a.nextFloat(100));
       // System.out.println(a.nextBoolean());

    }
}
