package _03_Uebungen_Klassen_und_Objekte;

class Bestellung {

    private Bestellposition[] positionen;

    public Bestellung() {
        this.positionen = new Bestellposition[10];
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

        for(int i = 0; i < 10; i++) {
            if(this.positionen[i] != null) {
                System.out.println (this.positionen[i].getMenge () + "x " + this.positionen[i].getWare ().getBezeichnung ());
            }
        }
    }






}
