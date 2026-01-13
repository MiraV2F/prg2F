package regular;

public class pr {
    public static void main(String[] args) {
        String regex = ".@.";
        String adresa = "a@b";
        if (adresa.matches(regex)) {
            System.out.println("OK");
        }
        else{
                System.out.println("neplatná adresa");
            }

    }
}
