package _11_Uebungen_Funktionales_und_IO.Aufgabe_2_a_b;

class Kunde {
    private String vorname;
    private String nachname;
    private String nummer;
    private boolean bekommtRabatt = false;

    public Kunde(String vorname, String nachname, String nummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.nummer = nummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getNummer() {
        return nummer;
    }

    public boolean isBekommtRabatt() {
        return bekommtRabatt;
    }

    public void setBekommtRabatt(boolean bekommtRabatt) {
        this.bekommtRabatt = bekommtRabatt;
    }

    @Override
    public String toString() {

        return  this.vorname + " " + this.nachname + " (KN " +this.nummer + ")";


    }
}
