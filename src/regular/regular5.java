package regular;

public class regular5 {
    public static void main(String[] args) {
        String regex = "\\D{3,5}.[A-Z]\\D{2,}";
        String osloveni = "pan Martin";
        if (osloveni.matches(regex)) {
            System.out.println("Správně");
        }
        else{
            System.out.println("špatně");
        }
    }
}

