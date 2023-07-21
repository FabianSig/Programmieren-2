package _09_Uebungen_Collections.Aufgabe_2_4;

public class WareExceptionIllegalWarenpreis extends WareException {

    public WareExceptionIllegalWarenpreis(Ware betroffeneWare) {
        super ("Warenpreis muss über 0 sein.", betroffeneWare);
    }
}
