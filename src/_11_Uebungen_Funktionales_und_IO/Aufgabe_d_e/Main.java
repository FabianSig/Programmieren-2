package _11_Uebungen_Funktionales_und_IO.Aufgabe_d_e;

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

        w = new Ware("03073105", "Ersatzkette", 7.45, Warengruppe.FAHRRADBEDARF);
        katalog.fuegeWareEin(w);

        System.out.println();
        System.out.println("Nur die Bezeichnungen");

        for (String bezeichnung : katalog.WarenNachBezeichnung ())
        {
            System.out.println(bezeichnung);
        }

        System.out.println();
        System.out.println(katalog.warenVorhanden(ware -> ware.getPreis() > 18.0));

    }

}
