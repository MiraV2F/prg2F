package dedicnost;

public class App {
    public static void main(String[] args) {
        Zvire z = new Zvire("Zvire");
        z.vydejZvuk();

        Pes p = new Pes("Max");
        p.vydejZvuk();
        p.pocetKoncetin = 4;

        Had h = new Had("Alois");
        h.svlekniKuzi();

    }
}
