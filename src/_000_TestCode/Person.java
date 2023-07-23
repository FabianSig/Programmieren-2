package _000_TestCode;

class Person {

    String vorname;
    String nachname;
    int alter;
    String geschlecht;

    public Person(String vorname, String nachname, int alter, String geschlecht) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    @Override
    public String toString() {
        return String.format ("%s %s %d %s", vorname, nachname, alter, geschlecht);
    }
}
