package _11_Uebungen_Funktionales_und_IO.Aufgabe_1;

class Main {

    public static void main(String[] args) {

        Warenkatalog katalog = new Warenkatalog ();
        Ware w;

        w = new Ware ("01019010", "Hammer", 19.00);
        katalog.fuegeWareEin(w);

        w = new Ware ("01019020", "Zange", 17.00);
        katalog.fuegeWareEin(w);

        w = new Ware ("01019030", "Schraubendreher", 12.00);
        katalog.fuegeWareEin(w);

        w = new Ware ("03073073", "Reifen", 33.00);
        katalog.fuegeWareEin(w);

        w = new Ware ("03073074", "Schlauch", 8.00);
        katalog.fuegeWareEin(w);

        w = new Ware ("03073103", "Luftpumpe", 13.00);
        katalog.fuegeWareEin(w);

        for(Ware ware : katalog){
            System.out.println (ware);
        }

        katalog.erhoehePreise(0.05, ware -> ware.getPreis() < 15.0);        System.out.println ();

        for(Ware ware : katalog){
            System.out.println (ware);
        }

        System.out.println ();
        katalog.setSortierkriterium (Sortierkriterium.NACH_BEZEICHNUNG);
        for(Ware ware : katalog){
            System.out.println (ware);
        }
        System.out.println ();
        katalog.setSortierkriterium (Sortierkriterium.NACH_PREIS);
        for(Ware ware : katalog){
            System.out.println (ware);
        }




    }

}
