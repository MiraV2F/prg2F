package regular;

public class regular1 {
    public static void main(String[] args) {
        String regex = "[1-7]\\d{2}.\\d{2}";
        String psc = "301 00";
        if (psc.matches(regex)) {
            System.out.println("Správně");
        }
        else{
            System.out.println("špatně");
        }
    }
}
