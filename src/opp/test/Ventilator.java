package opp.test;

import java.sql.SQLOutput;

public class Ventilator {
    static boolean jeZapnuty;
    static boolean stav;

    public void vypni() {
        jeZapnuty = false;
        System.out.println("Ventilátor je vypnutý");

     }
    public void zapni() {
        jeZapnuty = true;
        System.out.println("Ventilátor je zapnutý");

    }
    public void stav() {
        System.out.println("Ventilátor je ?");
        System.out.println((jeZapnuty));

    }


}
