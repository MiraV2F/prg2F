package cykly;

public class cykly2 {
    public static void main(String[] args) {
        int[] pole = {1,2,0,3,5,8,0,3};

        int nul = 0;
        for (int hodnota : pole) {
            if (hodnota == 0) nul++;
        }
        System.out.println("nul: " + nul);
    }
}
