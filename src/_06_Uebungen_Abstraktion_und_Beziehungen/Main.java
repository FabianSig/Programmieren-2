package _06_Uebungen_Abstraktion_und_Beziehungen;

class Main {
    public static void main(String[] args) {

        Fahrzeughalter[] halter = {
                new Fahrzeughalter ("Riese Goliath"),
                new Fahrzeughalter ("Dagobert Duck"),
                new Fahrzeughalter ("Donald Duck")
        };



        Fahrzeug[] fahrzeuge = {
                new Fahrzeug(halter[0], 16),
                new Pkw (halter[1], 4, 5),
                new Motorrad (halter[2])
        };

        for (int i = 0; i < halter.length; i++){

            System.out.println (halter[i]);
            System.out.println (fahrzeuge[i]);
            System.out.println ();
        }


    }
}
