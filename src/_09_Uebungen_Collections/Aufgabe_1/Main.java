package _09_Uebungen_Collections.Aufgabe_1;

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

            System.out.println ("Das Fahrzeug von " + halter[i] + " ist ein " + halter[i].getFahrzeug ().get (0).getFahrzeugart () + " mit " + halter[i].getFahrzeug ().get (0).getAnzahlRaeder () + " Rädern.");
            System.out.println (fahrzeuge[i]);
            System.out.println ();
        }


    }
}
