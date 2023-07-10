package _06_Uebungen_Abstraktion_und_Beziehungen.Aufgabe_4;

abstract class JuristischePerson extends Person {

    private String name;

    public JuristischePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
