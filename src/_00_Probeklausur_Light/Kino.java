package _00_Probeklausur_Light;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Kino {
    private List<Film> filme = new ArrayList<> ();

    public void addFilm(Film film){
        filme.add (film);
    }

    public Film getKuerzesterFilm(){

        return this.filme.stream()
                .min(Comparator.comparingInt(Film::getLeange))
                .orElse (null);


    }
    public Film getLaengsterFilm(){
        return this.filme.stream()
                .max(Comparator.comparingInt(Film::getLeange))
                .orElse (null);
    }

    public double getDurchschnittsdauer(){

        return (double) this.filme.stream ()
                .mapToInt (Film::getLeange)
                .sum() / (double) filme.size ();
    }

    public List<Film> getFilmeNachLaenge(){
        //this.filme.sort(Comparator.comparing (Film::getLeange));
        //return filme;

        return filme.stream ()
                .sorted (Comparator.comparing (Film::getLeange))
                .collect (toList ());


    }
}
