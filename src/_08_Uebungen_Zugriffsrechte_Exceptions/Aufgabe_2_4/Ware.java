package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_2_4;

class Ware{
    private String nummer;
    protected String bezeichnung;
    private double preis;

    public Ware(String nummer, String bezeichnung, double preis) throws WareExceptionIllegalWarennummer {



        if(preis < 0) throw new IllegalArgumentException ("Preis muss größer als 0 sein.");
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;

        if(Integer.parseInt (nummer) < 0) throw new WareExceptionIllegalWarennummer (this);

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
