package _04_Uebungen_Klassenattribute_String;

class Main {

    public static void main(String[] args) {

        Kunde k;
        k = new Kunde("Dagobert", "Duck", "000351");
        Bestellung best = new Bestellung (k);
        Bestellposition pos;
        Ware w;

        w = new Ware("01019010", "Hammer", 19.00);
        pos = new Bestellposition (w, 30);
        best.nimmAuf(pos);

        k = new Kunde("Emil", "Erpel", "000462");
        w = new Ware ("01019020", "Zange", 17.00);
        pos = new Bestellposition (w, 20);
        best.nimmAuf (pos);

        best.zeigeAn ();
    }

}
