package opp.test;

import java.sql.SQLOutput;

public class Ventilator {
    static boolean jeZapnuty;
    static boolean stav;

    public void vypni() {
        if (jeZapnuty) stav = false;
        System.out.println("Ventilátor je vypnutý");

     }
    public void zapni() {
        if (jeZapnuty) stav = true;
        System.out.println("Ventilátor je zapnutý");

    }
    public void stav() {
        if (jeZapnuty) stav = true;

    }


}
