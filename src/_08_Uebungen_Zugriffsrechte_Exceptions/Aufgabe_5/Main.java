package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_5;

class Main {

    public static void main(String[] args) {

        Kunde k;
        k = new Kunde ("Dagobert", "Duck", "000351");
        Bestellung best = new Bestellung (k);
        Bestellposition pos;
        Ware w;
        Ware w1;

        try{
            w1 = new Ware("01019010", "Hammer", 19.00);
            w = new Ware ("01019020", "Zange", 17.00);
            pos = new Bestellposition (w1, 20);

            best.nimmAuf(pos);

            pos = new Bestellposition (w, 30);

            best.nimmAuf (pos);



            best.zeigeAn ();
        }

        catch (BestellException | WareExceptionIllegalWarennummer e){
            e.printStackTrace ();
        }




    }

}
