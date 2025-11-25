package cykly.test;
import java.util.Random;

public class priklad1 {
    public static void main(String[] args) {
        Random random = new Random();
        int num;
        num = random.nextInt(-5,20);
        do{
                num = random.nextInt(-5, 20);

            System.out.println(num);
         }while(num >= 0);
        System.out.println("Konec");

    }
}
