package _09_Uebungen_Collections.Aufgabe_2;

public class WareExceptionIllegalWarennummer extends WareException {

    public WareExceptionIllegalWarennummer(Ware betroffeneWare) {
        super ("Warennummer von " + betroffeneWare.getBezeichnung () +  " muss über 0 sein.", betroffeneWare);
    }
}
