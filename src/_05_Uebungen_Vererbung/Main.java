package _05_Uebungen_Vererbung;

class Main {
    public static void main(String[] args) {

        Fahrzeug[] fahrzeuge = new Fahrzeug[] {
                new Fahrzeug(16), new Pkw(4, 5), new Motorrad() };

        for (Fahrzeug f : fahrzeuge)
        {
            System.out.println(f);
        }

    }
}
