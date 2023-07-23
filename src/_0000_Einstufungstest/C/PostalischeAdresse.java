package _0000_Einstufungstest.C;

class PostalischeAdresse implements Adresse {

    private String strasse;
    private int hausnummer;
    private String plz;
    private String ort;


    public PostalischeAdresse(String strasse, int hausnummer, String plz, String ort) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    @Override
    public String toString() {
        return String.format ("%s %d, %s %s", this.strasse, this.hausnummer, this.plz, this.ort);
    }
}
