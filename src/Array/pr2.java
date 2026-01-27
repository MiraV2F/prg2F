package Array;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class pr2 {
    public static void main(String[] args) {
        String[] pole = {"Čína", "Chile", "Ceylon", "Dánsko"};
        Collator csCol = Collator.getInstance(new Locale("cs", "CZ"));
        Arrays.sort(pole);
        System.out.println(Arrays.toString(pole));
        //Arrays.sort(pole, Collections.reverseOrder(csCol));
        //System.out.println(Arrays.toString(pole));
    }
}
