package _11_Uebungen_Funktionales_und_IO.Aufgabe_2_c;

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

        // Und jetzt nur noch der Fahrradbedarf über 10 EUR

        System.out.println();
        System.out.println("Gruppiert nach Fahrradbedarf");

        for (Ware ware : katalog.filtern(ware -> ware.getGruppe() == Warengruppe.FAHRRADBEDARF && ware.getPreis() > 10.0))
        {
            System.out.println(ware);
        }

    }

}
