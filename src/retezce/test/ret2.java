package retezce.test;

public class ret2 {
    public static void main(String[] args) {
        String adresa = "Klatovská 200G".substring(10, 14);
        if (adresa.endsWith("200G")) {
            System.out.println(adresa);
        }
    }
}
