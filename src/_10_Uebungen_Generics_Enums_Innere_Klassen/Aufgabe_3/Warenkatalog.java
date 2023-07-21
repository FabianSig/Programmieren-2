package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_3;

import java.util.*;

class Warenkatalog  implements Iterable<Ware>{

    private TreeMap<String, Ware> katalog;
    private List<Sortierkriterium> kriterien;
    public static final Map<Sortierkriterium, Comparator<Ware>> COMPARATORS;
    public Warenkatalog(){

        this.katalog = new TreeMap<> ();
        this.kriterien = new ArrayList<> ();
        this.kriterien.add(Sortierkriterium.NACH_NUMMER);
    }

    static{
        COMPARATORS = new HashMap<Sortierkriterium, Comparator<Ware>>();

        COMPARATORS.put(Sortierkriterium.NACH_PREIS, new WarenPreisComparator());
        COMPARATORS.put(Sortierkriterium.NACH_BEZEICHNUNG, new WarenBezeichnungComparator());
        COMPARATORS.put(Sortierkriterium.NACH_NUMMER, new WarenNummerComparator());
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

    public Collection<Ware> alleWaren()
    {
        List<Ware> liste = new ArrayList<Ware>(katalog.values());

        Comparator<Ware> comparator = getComparator();
        liste.sort(comparator);

        return liste;
    }
    public Collection<String> alleWarennummern(){
        return this.katalog.keySet ();
    }

    public void setSortierkriterium(Sortierkriterium ... kriterium){
        this.kriterien = Arrays.asList (kriterium);
    }
    @Deprecated
    public void zeigealleWarennachPreis(){
        System.out.printf("%-15s%15s%15s%n", "Warennummer", "Ware", "Preis");

    }
    @Override
    public Iterator<Ware> iterator() {

        return alleWaren ().iterator ();
    }

    private Comparator<Ware> getComparator()
    {
        Comparator<Ware> result = null;

        for (Sortierkriterium sortierkriterium : kriterien)
        {
            Comparator<Ware> comparator = COMPARATORS.get(sortierkriterium);
            if (result == null)
            {
                result = comparator;
            }
            else
            {
                result = result.thenComparing(comparator);
            }
        }

        return result;
    }

}
