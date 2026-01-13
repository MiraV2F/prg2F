package regular;

public class regular2 {
    public static void main(String[] args) {
        String regex = "\\d{6}.\\d{4}";
        String rodneC = "123456/7891";
        if (rodneC.matches(regex)) {
            System.out.println("Správně");
        }
        else{
            System.out.println("špatně");
        }
    }
}
