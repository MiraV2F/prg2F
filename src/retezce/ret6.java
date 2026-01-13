package retezce;

public class ret6 {
    public static void main(String[] args) {
        int cislo = 159;
        String retezec = String.valueOf(cislo).split("");
        for (int i =  retezec.length()-1; i>=0;i--){
            System.out.println(retezec[i]);
        }
    }
}
