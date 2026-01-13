package regular;

public class regular1 {
    public static void main(String[] args) {
        String regex = "[3,]\\d\\d.\\d\\d";
        String psc = "301 00";
        if (psc.matches(regex)) {
            System.out.println("Správně");
        }
        else{
            System.out.println("špatně");
        }
    }
}
