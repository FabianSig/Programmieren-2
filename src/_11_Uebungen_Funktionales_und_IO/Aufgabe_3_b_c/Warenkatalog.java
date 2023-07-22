package _11_Uebungen_Funktionales_und_IO.Aufgabe_3_b_c;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        COMPARATORS = new HashMap<> ();

        COMPARATORS.put(Sortierkriterium.NACH_PREIS, (w1, w2) -> (int) (w1.getPreis () - w2.getPreis ()));
        COMPARATORS.put(Sortierkriterium.NACH_BEZEICHNUNG, Comparator.comparing (Ware::getBezeichnung));
        COMPARATORS.put(Sortierkriterium.NACH_NUMMER, Comparator.comparing (Ware::getBezeichnung));
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

    public List<Ware> alleWaren()
    {
        List<Ware> liste = new ArrayList<>(katalog.values());

        Comparator<Ware> comparator = getComparator();
        liste.sort(comparator);

        return liste;
    }
    public Collection<String> alleWarennummern(){
        return this.katalog.keySet ();
    }

    public void setSortierkriterium(Sortierkriterium... kriterium){
        this.kriterien = Arrays.asList (kriterium);
    }

    public void erhoehePreise(double erhoehung, Predicate<Ware> bedingung){
        this.katalog.values ().stream().filter(bedingung).forEach (w -> w.setPreis (w.getPreis () * (1+erhoehung)));
    }

    public List<Ware> filtern(Predicate<Ware> bedingung){
        return this.katalog.values ().stream ().filter (bedingung).collect(Collectors.toList());
    }

    public List<String> WarenNachBezeichnung(){
        return this.katalog.values ().stream ().map (Ware::getBezeichnung).distinct ().collect(Collectors.toList());
    }

    public boolean warenVorhanden(Predicate<Ware> bedingung){
        return this.katalog.values ().stream ().anyMatch (bedingung);
    }

    public Map<Warengruppe, Integer> anzahlWarenJeWarengruppe(){
        return this.katalog.values ().stream ().collect(Collectors.groupingBy (Ware::getGruppe, Collectors.summingInt (w -> 1)));
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

    public void save() throws IOException {
        Path path = Paths.get (System.getProperty ("user.home"), "test.txt");
        try{
            Files.createFile (path);
        }
        catch(IOException e){
            throw new IOException ("Fehler beim Erstellen der Datei");
        }

        List<String> output = new ArrayList<> ();

        this.katalog.values ().forEach (w-> output.add(w.toString ()));

        Files.write(path, output);

    }

    public void load() throws IOException, ParseException {
        Path path = Paths.get (System.getProperty ("user.home"), "test.txt");
        List<String> content;

        try{
            content = Files.readAllLines (path);

        }
        catch(IOException e){
            throw new IOException ("Fehler beim Erstellen der Datei");
        }

        for(String s : content){
            String daten[] = s.split("---");
            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            try{
                this.fuegeWareEin (new Ware(daten[0], daten[1], format.parse(daten[2]).doubleValue (), Warengruppe.valueOf (daten[3])));
            }
            catch(ParseException e){
                throw new ParseException ("Fehler im Format", 2);
            }

        }
    }

}
