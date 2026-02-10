package Array;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        String[][] svatky = {
                {"2.1: Karina, Vasil."},
                {"3.1: Radmila, Radomil."},
                {"4.1: Diana, Dajana."},
                {"6.1: Kašpar, Melichar, Baltazar (Tři králové)."},
                {"8.1: Čestmír."},
                {"9.1: Vladan, Valtr."},
                {"14.1: Radovan."},
                {"15.1: Alice"},
                {"20.1: Ilona, Sebastián."},
                {"23.1: Zdeněk."},
                {"24.1: Milena, Amanda."},
                {"30.1: Robin, Erna."},
                {"31.1: Marika, Marieta"}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte datum svátku: ");
        String svatek = scanner.nextLine();
        for (int i = 0; i < svatky.length; i++) {
            for (int j = 0; j < svatky[i].length; i++) {
                if (svatky[i][j].equalsIgnoreCase(svatek)) {
                    System.out.println(svatky[i][j-1]);
                }
        }
}
}
}