package _09_Uebungen_Collections.Aufgabe_2_4;

import java.util.HashSet;

class Bestellung {

    private Kunde kunde;
    private HashSet<Bestellposition> positionen;

    public Bestellung(Kunde kunde) {
        this.positionen = new HashSet<> ();
        this.kunde = kunde;
    }

    public void nimmAuf(Bestellposition position) throws BestellException {

        positionen.add (position);

    }

    public void zeigeAn(){

        System.out.println ("Bestellung von " + this.kunde);
        System.out.printf ("%10s%15s%15s%15s\n", "Nummer", "Bezeichnung", "Listenpreis", "Menge");
        this.positionen.forEach (System.out::print);
    }






}
