package retezce.test;

public class ret1 {
    public static void main(String[] args) {
        String rodneCislo = "082510/3555";
        if(rodneCislo.contains("/")) {
            System.out.println(rodneCislo);
        }
        else{
            System.out.println("Chybí lomítko na 5 místě od konce");
        };

    }
}
