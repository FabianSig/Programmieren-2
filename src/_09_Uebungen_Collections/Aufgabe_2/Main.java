package _09_Uebungen_Collections.Aufgabe_2;

class Main {

    public static void main(String[] args) {

        Warenkatalog katalog = new Warenkatalog();
        Ware w;

        w = new Ware("01019010", "Hammer", 19.00);
        katalog.fuegeWareEin(w);

        w = new Ware("01019020", "Zange", 17.00);
        katalog.fuegeWareEin(w);

        w = new Ware("01019030", "Schraubendreher", 12.00);
        katalog.fuegeWareEin(w);

        w = new Ware("03073073", "Reifen", 33.00);
        katalog.fuegeWareEin(w);

        w = new Ware("03073074", "Schlauch", 8.00);
        katalog.fuegeWareEin(w);

        w = new Ware("03073103", "Luftpumpe", 13.00);
        katalog.fuegeWareEin(w);

        katalog.zeigeKatalog();
        System.out.println();
        katalog.zeigealleWarennachBezeichnung ();
        System.out.println();
        katalog.zeigealleWarennachPreis ();





    }

}
