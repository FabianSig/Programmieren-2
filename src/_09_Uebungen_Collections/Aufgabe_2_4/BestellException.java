package _09_Uebungen_Collections.Aufgabe_2_4;

class BestellException extends Exception{

    private Bestellposition position;

    public BestellException(Bestellposition position, int fuellgrad){
        super("Die Bestellung hat bereits " + fuellgrad + " Bestellungen.");
        this.position = position;
    }

    public Bestellposition getPosition() {
        return position;
    }
}
