package _11_Uebungen_Funktionales_und_IO.Aufgabe_3_a;

import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException {

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

        katalog.save();
    }
}
