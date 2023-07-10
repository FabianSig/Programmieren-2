package _06_Uebungen_Abstraktion_und_Beziehungen.Aufgabe_4;

class Main {
    public static void main(String[] args) {

        Fahrzeughalter[] halter = {
                new Firma ("Dagobert Duck Inc."),
                new NatuerlichePerson ("Donald",  "Duck")
        };



        Fahrzeug[] fahrzeuge = {
                new Pkw (halter[0], 4, 5),
                new Motorrad (halter[1])
        };

        for (int i = 0; i < halter.length; i++){

            System.out.println ("Das Fahrzeug von " + halter[i] + " ist ein " + halter[i].getFahrzeug ().getFahrzeugart () + " mit " + halter[i].getFahrzeug ().getAnzahlRaeder () + " Rädern.");
            System.out.println (fahrzeuge[i]);
            System.out.println ();
        }


    }
}
