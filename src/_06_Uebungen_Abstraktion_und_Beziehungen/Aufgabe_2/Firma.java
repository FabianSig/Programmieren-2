package _06_Uebungen_Abstraktion_und_Beziehungen.Aufgabe_2;

class Firma extends Fahrzeughalter{
    private String name;

    public Firma(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Das Fahrzeug von " + this.name + " ist ein " + super.getFahrzeug ().getFahrzeugart () + " mit " + super.getFahrzeug ().getAnzahlRaeder () + " Rädern.";
    }
}
