package _09_Uebungen_Collections.Aufgabe_2;

public class WareException extends Exception{

    private Ware betroffeneWare;

    public WareException(String message, Ware betroffeneWare) {
        super (message);
        this.betroffeneWare = betroffeneWare;
    }

    public Ware getBetroffeneWare() {
        return betroffeneWare;
    }
}
