package regular;

public class regular4 {
    public static void main(String[] args) {
        String regex = "Martin";
        String jmeno = "";
        if (jmeno.matches(regex)) {
            System.out.println("Správně");
        }
        else{
            System.out.println("špatně");
        }
    }
}
