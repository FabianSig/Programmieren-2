package _04_Uebungen_Klassenattribute_String;

class Bestellung {

    private Kunde kunde;
    private Bestellposition[] positionen;

    public Bestellung(Kunde kunde) {
        this.positionen = new Bestellposition[10];
        this.kunde = kunde;
    }

    public void nimmAuf(Bestellposition position){
        for(int i = 0; i < 10; i++){
            if(this.positionen[i] == null){
                this.positionen[i] = position;
                break;
            }
        }
    }

    public void zeigeAn(){

        System.out.println ("Bestellung von " + this.kunde);
        System.out.format ("%10s", "Nummer");
        System.out.format ("%15s", "Bezeichnung");
        System.out.format ("%15s", "Listenpreis");
        System.out.format ("%15s", "Menge");

        System.out.println ();
        for(int i = 0; i < 10; i++) {
            if(this.positionen[i] != null) {
                System.out.print (this.positionen[i]);
            }
        }
    }






}
