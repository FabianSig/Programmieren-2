package _11_Uebungen_Funktionales_und_IO.Aufgabe_2_a_b;

class Main {

    public static void main(String[] args) {

        Warenkatalog katalog = new Warenkatalog();
        Ware w;

        w = new Ware("01019010", "Hammer", 19.00, Warengruppe.WERKZEUG);
        katalog.fuegeWareEin(w);

        w = new Ware("01019020", "Zange", 17.00, Warengruppe.WERKZEUG);
        katalog.fuegeWareEin(w);

        w = new Ware("01019030", "Schraubendreher", 12.00, Warengruppe.WERKZEUG);
        katalog.fuegeWareEin(w);

        w = new Ware("03073073", "Reifen", 33.00, Warengruppe.FAHRRADBEDARF);
        katalog.fuegeWareEin(w);

        w = new Ware("03073074", "Schlauch", 8.00, Warengruppe.FAHRRADBEDARF);
        katalog.fuegeWareEin(w);

        w = new Ware("03073103", "Luftpumpe", 13.00, Warengruppe.FAHRRADBEDARF);
        katalog.fuegeWareEin(w);

        w = new Ware("03073104", "Ersatzkette", 8.00, Warengruppe.FAHRRADBEDARF);
        katalog.fuegeWareEin(w);

        // Wende die Preiserhöhung nur auf Waren an, die günstiger als 15 EUR sind.
        katalog.erhoehePreise(0.05, ware -> ware.getPreis() < 15.0);

        System.out.println("Sortiert nach Warennummer");
        for (Ware ware : katalog)
        {
            System.out.println(ware);
        }

        System.out.println();
        System.out.println("Sortiert nach Preis");
        katalog.setSortierkriterium(Sortierkriterium.NACH_PREIS);

        for (Ware ware : katalog)
        {
            System.out.println(ware);
        }

        System.out.println();
        System.out.println("Sortiert nach Bezeichnung");
        katalog.setSortierkriterium(Sortierkriterium.NACH_BEZEICHNUNG);

        for (Ware ware : katalog)
        {
            System.out.println(ware);
        }

        // Und jetzt mehrstufig, erst Preis, dann Bezeichnung

        System.out.println();
        System.out.println("Sortiert nach Preis und dann Bezeichnung");
        katalog.setSortierkriterium(Sortierkriterium.NACH_PREIS, Sortierkriterium.NACH_BEZEICHNUNG);

        for (Ware ware : katalog)
        {
            System.out.println(ware);
        }

        // Und jetzt nur noch der Fahrradbedarf

        System.out.println();
        System.out.println("Gruppiert nach Fahrradbedarf");

        for (Ware ware : katalog.filtern(Warengruppe.FAHRRADBEDARF))
        {
            System.out.println(ware);
        }




    }

}
