package Array;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {

                String[][] znackyKraju = {
                        {"Hlavní město Praha","A"},
                        {"Středočeský kraj","S"},
                        {"Ústecký kraj","U"},
                        {"Liberecký kraj","L"},
                        {"Karlovarský kraj","K"},
                        {"Královehradecký kraj","H"},
                        {"Pardubický kraj","E"},
                        {"Plzeňský kraj","P"},
                        {"Jihočeský kraj","C"},
                        {"Kraj Vysočina","J"},
                        {"Jihomoravský kraj","B"},
                        {"Olomoucký kraj","M"},
                        {"Moravskoslezský kraj","T"},
                        {"Zlínský kraj","Z"}};
                Scanner scanner = new Scanner(System.in);
                System.out.print("Zadejte písmeno kraje z Vaší SPZ: ");
                String znacka = scanner.nextLine();
                for (int i = 0; i < znackyKraju.length; i++) {
                    for (int j = 0; j < znackyKraju[i].length; j++) {
                        if (znackyKraju[i][j].equalsIgnoreCase(znacka)) {
                            System.out.println(znackyKraju[i][j-1]);
                        }
                    }
                }

            }


        }


