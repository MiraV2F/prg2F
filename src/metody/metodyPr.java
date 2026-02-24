package metody;

public class metodyPr {
    public static void main(String[] args) {
        //pozdrav("Čus", 3);
        //System.out.println("-----");
        //pozdrav("Pičo", 3);

        int cast1 = objemKvadru(10, 20, 30);
        int cast2 = objemKvadru(25, 28, 30);
        System.out.println("celkem" + (cast1+cast2));
    }

    public static void pozdrav(String text, int pocet) {
        for (int i=0; i < pocet; i++) {
            System.out.println(text);
        }
    }
    public static int objemKvadru(int a, int b, int c) {
        //System.out.println(a*b*c);
        int vysledek = a*b*c;
        return vysledek;
    }
}
