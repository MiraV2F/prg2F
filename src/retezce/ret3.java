package retezce;

public class ret3 {
    public static void main(String[] args) {
        String[] tetxArray = {"první", "něco", "nic", "poslední"};

        if(tetxArray.length > 0) {
        System.out.println(tetxArray[0].toUpperCase());
        for (int i =1; i < tetxArray.length - 1; i++){
            System.out.println(tetxArray[i]);
        }
        System.out.println(tetxArray[tetxArray.length - 1].toUpperCase());
    }

}
}
