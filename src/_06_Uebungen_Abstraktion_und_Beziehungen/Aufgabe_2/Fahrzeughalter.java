package _06_Uebungen_Abstraktion_und_Beziehungen.Aufgabe_2;

abstract class Fahrzeughalter {
    private Fahrzeug fahrzeug;
    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }
    public void setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

}
