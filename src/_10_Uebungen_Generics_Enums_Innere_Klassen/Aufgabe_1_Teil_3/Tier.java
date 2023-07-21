package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_1_Teil_3;

abstract class Tier {

    private String name;

    public Tier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
