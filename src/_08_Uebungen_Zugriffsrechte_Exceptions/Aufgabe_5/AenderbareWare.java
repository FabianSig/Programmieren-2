package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_5;

class AenderbareWare extends Ware {
    public AenderbareWare(String nummer, String bezeichnung, double preis) throws WareExceptionIllegalWarennummer {
        super (nummer, bezeichnung, preis);
    }

    void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
}
