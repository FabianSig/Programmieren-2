package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_1_Teil_1_2;

class Main {

    public static void main(String[] args) {

        Eisbaer knut = new Eisbaer("Knuuut");
        Eisbaer lars = new Eisbaer("Lars"); // Knuts Vater
        Zoo<Eisbaer> zoo = new Zoo<Eisbaer>();
        zoo.fuegeHinzu(knut);
        zoo.fuegeHinzu(lars);

    }
}
