package _11_Uebungen_Funktionales_und_IO.Aufgabe_2_a_b;

class Ware{
    private String nummer;
    protected String bezeichnung;
    private Warengruppe gruppe;
    private double preis;

    public Ware(String nummer, String bezeichnung, double preis, Warengruppe gruppe){

        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.gruppe = gruppe;
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

    public Warengruppe getGruppe() {
        return gruppe;
    }

    @Override
    public String toString() {
        return String.format ("%10s%20s%15.2f", this.nummer, this.bezeichnung, this.preis);
    }
}
