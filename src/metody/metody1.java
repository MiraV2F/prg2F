package metody;
import java.util.Random;
public class metody1 {
    public static void main(String[] args) {
int n = 8;
int min = 1;
int max = 15;
    }
    public static void cisla(int n , int min , int max){
        Random random = new Random();

        for (int i = 0; i < n; i++){
            int cislo = random.nextInt(max - min + 1) + min;
            System.out.println(cislo);


        }
    }
}
