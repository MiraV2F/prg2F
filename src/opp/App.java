package opp;

public class App {
    public static void main() {
        Auto a1 = new Auto();
        a1.nazev = " bourák";
        a1.barva = " zelená";
        a1.maxRychlost = 200;
        a1.jePojizdne = true;

        Auto a2 = new Auto();
        a2.nazev = " plechovka";
        a2.barva = " černá";
        a2.maxRychlost = 60;
        a2.jePojizdne =  true;

        a1.vypisInfo();

    }
}
