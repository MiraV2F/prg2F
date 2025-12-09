package retezce;

public class ret1 {
    public static void main(String[] args) {
        boolean jeJmeno = false;
        String uzivJmeno = "Milan";
        String[] pole = {"Matěj", "Milan", "Martin", "Mojmír", "Michal", "Marek"};

        for (String jmeno : pole) {
            if ((jmeno == uzivJmeno) == true){
                jeJmeno = true;
            }
        }
        if (jeJmeno == true){
            System.out.println("Jmeno " + uzivJmeno + " je v poli");
        }
        else {
            System.out.println("Jmeno " + uzivJmeno + " neni v poli");
        }
    }
}
