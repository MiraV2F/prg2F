package regular;

public class regular6 {
    public static void main(String[] args) {
        String regex = ".{0,1}\\d.\\d{0,}";
        String dCislo = "+9.25225";
        if (dCislo.matches(regex)) {
            System.out.println("Správně");
        }
        else{
            System.out.println("špatně");
        }
    }
}

