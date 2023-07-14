package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_2_4;

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
