package _06_Uebungen_Abstraktion_und_Beziehungen.Aufgabe_1;

class Fahrzeughalter {
    private String halter;
    private Fahrzeug fahrzeug;

    public Fahrzeughalter(String halter) {
        this.halter = halter;
    }

    public String getHalter() {
        return halter;
    }

    public void setHalter(String halter) {
        this.halter = halter;
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    public void setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    @Override
    public String toString() {
        return "Das Fahrzeug von " + this.halter + " ist ein " + this.fahrzeug.getFahrzeugart () + " mit " + this.fahrzeug.getAnzahlRaeder () + " Rädern."
                ;
    }
}
