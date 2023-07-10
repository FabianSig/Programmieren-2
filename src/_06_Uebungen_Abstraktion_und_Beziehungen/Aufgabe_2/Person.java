package _06_Uebungen_Abstraktion_und_Beziehungen.Aufgabe_2;

class Person extends Fahrzeughalter{
    String vorname;
    String nachname;

    public Person(String vorname, String nachname) {
        super();
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return "Das Fahrzeug von " + this.vorname + " " + this.nachname + " ist ein " + super.getFahrzeug ().getFahrzeugart () + " mit " + super.getFahrzeug ().getAnzahlRaeder () + " Rädern.";
    }
}
