package _09_Uebungen_Collections.Aufgabe_2_4;

public class WareExceptionIllegalWarennummer extends WareException {

    public WareExceptionIllegalWarennummer(Ware betroffeneWare) {
        super ("Warennummer von " + betroffeneWare.getBezeichnung () +  " muss über 0 sein.", betroffeneWare);
    }
}
