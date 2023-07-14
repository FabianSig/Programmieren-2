package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_2_4;

public class WareExceptionIllegalWarennummer extends WareException{

    public WareExceptionIllegalWarennummer(Ware betroffeneWare) {
        super ("Warennummer von " + betroffeneWare.getBezeichnung () +  " muss über 0 sein.", betroffeneWare);
    }
}
