package podminky;

public class podminka_if_else {
    public static void main(String[] args) {
        byte vek = 16;

        if (vek < 12) {
            System.out.println("je dítě");
        }
        else if (vek < 18) {
            System.out.println("je dospívající");
        }
        else {
            System.out.println("je dosplělí");
        }
    }
}
