package regular;

public class regular3 {
    public static void main(String[] args) {
        String regex = "[A-Z]{3}[1,]{4}";
        String poznavaciZ = "HAL2348";
        if (poznavaciZ.matches(regex)) {
            System.out.println("Správně");
        }
        else{
            System.out.println("špatně");
        }
    }
}
