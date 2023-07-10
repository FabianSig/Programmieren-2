package _04_Uebungen_Klassenattribute_String;

class Ware{
    private String nummer;
    private String bezeichnung;
    private double preis;

    public Ware(String nummer, String bezeichnung, double preis) {
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
        return String.format ("%15s",this.nummer) + " " + String.format ("%15s", this.bezeichnung) + " " + String.format ("%15.2f", this.preis);
    }
}
