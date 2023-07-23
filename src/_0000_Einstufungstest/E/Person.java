package _0000_Einstufungstest.E;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String anrede;
    private String vorname;
    private String nachname;
    private LocalDate geburtstag;
    private List<Adresse> adressen;

    public Person(String anrede, String vorname, String nachname, LocalDate geburtstag) {
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = geburtstag;
        this.adressen = new ArrayList<> ();
    }

    public String getAnrede() {
        return anrede;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public List<Adresse> getAdressen() {
        return adressen;
    }

    public void setAdressen(Adresse adresse) {
        this.adressen.add (adresse);
    }

    @Override
    public String toString() {
        return String.format ("%s %s %s %s %s", this.anrede, this.vorname, this.nachname, this.geburtstag, this.adressen.stream ().map (Adresse::toString).collect(Collectors.joining (" ")));
    }
}
