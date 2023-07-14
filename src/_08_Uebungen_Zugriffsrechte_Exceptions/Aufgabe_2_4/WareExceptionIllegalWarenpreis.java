package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_2_4;

public class WareExceptionIllegalWarenpreis extends WareException{

    public WareExceptionIllegalWarenpreis(Ware betroffeneWare) {
        super ("Warenpreis muss über 0 sein.", betroffeneWare);
    }
}
