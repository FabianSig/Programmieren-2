package _09_Uebungen_Collections.Aufgabe_1;

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
