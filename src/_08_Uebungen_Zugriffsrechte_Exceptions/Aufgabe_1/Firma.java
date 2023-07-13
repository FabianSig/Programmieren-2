package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_1;

class Firma extends JuristischePerson implements Fahrzeughalter {
    private Fahrzeug fahrzeug;

    public Firma(String name) {
        super(name);

    }
    @Override
    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    @Override
    public void setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }



    @Override
    public String toString() {
        return "Firma " + super.toString ();
    }
}
