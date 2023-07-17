package _09_Uebungen_Collections.Aufgabe_2;

class AenderbareWare extends Ware {
    public AenderbareWare(String nummer, String bezeichnung, double preis) throws WareExceptionIllegalWarennummer {
        super (nummer, bezeichnung, preis);
    }

    void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
}
