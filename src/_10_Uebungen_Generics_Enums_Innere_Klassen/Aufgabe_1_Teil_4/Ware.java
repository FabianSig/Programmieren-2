package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_1_Teil_4;

class Ware{
    private String nummer;
    protected String bezeichnung;
    private double preis;

    public Ware(String nummer, String bezeichnung, double preis){

        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;


    }

    public String getNummer() {
        return nummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return String.format ("%10s%20s%15.2f", this.nummer, this.bezeichnung, this.preis);
    }
}
