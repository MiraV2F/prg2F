package metody.test;

public class test2 {
    static void main(String[] args) {
        biggest(2, 5,8);
    }
    static void biggest(int a, int b, int c) {
        int[] vyber = {a, b, c};
        int hodnota = a;
        for (int x : vyber)
            if (x > hodnota) {
                hodnota = x;
                System.out.println(x);
            }
        ;
    }

}
