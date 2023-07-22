package _11_Uebungen_Funktionales_und_IO.Aufgabe_3_b_c;

import java.io.IOException;
import java.text.ParseException;

class Main {

    public static void main(String[] args) throws IOException, ParseException {

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

        // siehe Ware.toString()
        // Die Ausgabe wurde für den Test so geändert, dass toString von Ware wieder die
        // originale Warennummer ausgibt.

        for (Ware ware : katalog)
        {
            System.out.println(ware);
        }
        katalog.save();

        // save() speichert aber die "neue" Warennummer

        System.out.println();

        // so dass Sie nach load() nun die neue, aus der Datei geladene Nummer sehen sollten.
        katalog.load();
        for (Ware ware : katalog)
        {
            System.out.println(ware);
        }
    }
}
