package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_2;

import java.util.*;

class Warenkatalog{

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
    @Deprecated
    public TreeSet<Ware> alleWarenNachBezeichnung(){
        TreeSet<Ware> nachWarenBezeichnung = new TreeSet<Ware> (new WarenBezeichnungComparator ());
        nachWarenBezeichnung.addAll(alleWaren ());
        return nachWarenBezeichnung;
    }
    @Deprecated
    public TreeSet<Ware> alleWarenNachPreis(){
        TreeSet<Ware> nachWarenPreis = new TreeSet<> (new WarenPreisComparator ());
        nachWarenPreis.addAll(alleWaren ());
        return nachWarenPreis;
    }
    @Deprecated
    public void zeigealleWarennachPreis(){
        System.out.printf("%-15s%15s%15s%n", "Warennummer", "Ware", "Preis");

        for(Ware ware : alleWarenNachPreis ()){
            System.out.println (ware);
        }
    }
    @Deprecated
    public void zeigealleWarennachBezeichnung(){
        System.out.printf("%-15s%15s%15s%n", "Warennummer", "Ware", "Preis");

        for(Ware ware : alleWarenNachBezeichnung ()){
            System.out.println (ware);
        }
    }
    public void zeigeKatalog(){
        System.out.printf("%15s%15s%n", "Warennummer", "Ware");

        for(HashMap.Entry<String, Ware> entry : this.katalog.entrySet ()){
            System.out.printf ("%15s%15s%n", entry.getKey (), entry.getValue ().getBezeichnung ());
        }
    }


}
