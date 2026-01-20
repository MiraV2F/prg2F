package regular;

public class regular7 {
    public static void main(String[] args) {
        String regex = "[1-31].[1-12].[,2026]";
        String narozeniny = "25.10.2008";
        if (narozeniny.matches(regex)) {
            System.out.println("Správně");
        }
        else{
            System.out.println("špatně");
        }
    }
}

