package _09_Uebungen_Collections.Aufgabe_2_4;

import java.util.*;

class Warenkatalog {

    private TreeMap<String, Ware> katalog;

    public Warenkatalog(){
        this.katalog = new TreeMap<> ();
    }

    public void fuegeWareEin(Ware ware){
        this.katalog.put (ware.getNummer (), ware);
    }

    public void entferneWare(Ware ware){
        this.katalog.remove (ware.getBezeichnung ());
    }

    public Ware gibWare(String warennummer){
        return this.katalog.get (warennummer);
    }

    public int anzahl(){
        return this.katalog.size ();
    }

    public Collection<Ware> alleWaren(){
        return this.katalog.values ();
    }

    public Collection<String> alleWarennummern(){
        return this.katalog.keySet ();
    }

    public Collection alleWarenNachBezeichnung(){
        TreeSet nachWarenBezeichnung = new TreeSet<> (new WarenBezeichnungComparator ());
        nachWarenBezeichnung.addAll(alleWaren ());
        return nachWarenBezeichnung;
    }
    public Collection alleWarenNachPreis(){
        TreeSet nachWarenPreis = new TreeSet<> (new WarenPreisComparator ());
        nachWarenPreis.addAll(alleWaren ());
        return nachWarenPreis;
    }

    public void zeigealleWarennachPreis(){
        System.out.printf("%15s%15s%15s%n", "Warennummer", "Ware", "Preis");

        for(Object obj : alleWarenNachPreis ()){
            Ware ware = (Ware) obj;
            System.out.printf ("%15s%15s%15s%n", ware.getNummer (), ware.getBezeichnung (), ware.getPreis ());
        }
    }
    public void zeigealleWarennachBezeichnung(){
        System.out.printf("%15s%15s%n", "Warennummer", "Ware");

        for(Object obj : alleWarenNachBezeichnung ()){
            Ware ware = (Ware) obj;
            System.out.printf ("%15s%15s%n", ware.getNummer (), ware.getBezeichnung ());
        }
    }
    public void zeigeKatalog(){
        System.out.printf("%15s%15s%n", "Warennummer", "Ware");

        for(HashMap.Entry<String, Ware> entry : this.katalog.entrySet ()){
            System.out.printf ("%15s%15s%n", entry.getKey (), entry.getValue ().getBezeichnung ());
        }
    }


}
