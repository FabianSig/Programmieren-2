package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_5;

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
