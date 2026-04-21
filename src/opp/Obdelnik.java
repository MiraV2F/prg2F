package opp;

public class Obdelnik {
    int strA;
    int strB;

    public void Obvod() {
        int i = (this.strA + this.strB) * 2;
        System.out.println("Obvod: " + i);
    }
    public void Obsah() {
        int j = this.strA * this.strB;
        System.out.println("Obsah: " + j);
    }


}
