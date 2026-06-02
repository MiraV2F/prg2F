package opp;

    public class Auto {
    String nazev;
    String barva;
    int maxRychlost, aktualniRychlost;
    boolean jePojizdne, jeNastartovane;

    public void vypisInfo() {
        System.out.println("nazev" + this.nazev);
        System.out.println("barva" + this.barva);
        System.out.println("max. Rychlost" + this.maxRychlost);
        System.out.println("je pojízdné" + ((this.jePojizdne)?"ano":"ne"));
    }
    void stav() {
        if (aktualniRychlost > 0) System.out.println("mohu jet a jedu " + aktualniRychlost);

    }
    public void nastartuj() {
        if (jePojizdne) jeNastartovane = true;
        else System.out.println("Nemohu nastartovat ,je to v pici.");
    }
    public void zrychly(int oKolik) {
       if (jeNastartovane) {
           aktualniRychlost += oKolik;
           System.out.println("Jedu " + aktualniRychlost +"km/h");
       }
       else if (!jePojizdne) {
           System.out.println("Nefunguji");
       }
       else System.out.println("Nejdřív nastartuj, vole!");
    }



}
