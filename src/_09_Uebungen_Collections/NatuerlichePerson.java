package _09_Uebungen_Collections;

class NatuerlichePerson extends Person implements Fahrzeughalter {
    private String vorname;
    private String nachname;
    private Fahrzeug fahrzeug;

    public NatuerlichePerson(String vorname, String nachname) {
        super();
        this.vorname = vorname;
        this.nachname = nachname;
    }


    @Override
    public String toString() {
        return vorname + " " + nachname;
    }

    @Override
    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    @Override
    public void setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }
}
