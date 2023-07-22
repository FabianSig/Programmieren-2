package _00_Probeklausur_Light;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kino {

    private List<Film> filme;

    public Kino() {
        this.filme = new ArrayList<> ();
    }

    public void addFilm(Film film){
        this.filme.add (film);
    }

    public Film getKurzesterFilm(){
        return this.filme.stream ().min (Comparator.comparingInt(Film::getLeange)).get();
    }
    public Film getLaengsterFilm(){
        return this.filme.stream ().max (Comparator.comparingInt(Film::getLeange)).get();
    }

    public double getDurchschnittlicheDauer(){
        return (double) this.filme.stream ().mapToInt (Film::getLeange).sum () / (double) this.filme.size ();
    }

    public List<Film> getFilmeNachLaenge(){
        return this.filme.stream ().sorted (Comparator.comparing (Film::getLeange)).collect(Collectors.toList());
    }




}
