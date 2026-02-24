package Array.Test;

import java.sql.SQLOutput;

public class test2 {
    public static void main(String[] args) {
        int[][] seznam ={
                {3, 100},
                {2, 150},
                {5, 200}};
        int celkem = 0;
        for(int [] row : seznam) {
            celkem += row[0] * row[1];
        }
        System.out.println("Celkova cena je: " + celkem);

    }
}
