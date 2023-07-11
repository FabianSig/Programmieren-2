package _00_Probeklausur_Light;

import java.util.ArrayList;
import java.util.List;

public class Kino {
    private List<Film> filme = new ArrayList<> ();

    public void addFilm(Film film){
        filme.add (film);
    }

    public Film getKuerzesterFilm(){

        Film kuerzester = filme.get(0);

        for(int i = 1; i < filme.size (); i++){
            if(filme.get(i).getLeange () < kuerzester.getLeange ()) kuerzester = filme.get(i);
        }

        return kuerzester;
    }
    public Film getLaengsterFilm(){

        Film laengster = filme.get(0);

        for(int i = 1; i < filme.size (); i++){
            if(filme.get(i).getLeange () > laengster.getLeange ()) laengster = filme.get(i);
        }

        return laengster;
    }

    public double getDurchschnittsdauer(){
        double sum_leange = 0;
        for(int i = 1; i < filme.size (); i++){
            sum_leange += filme.get(i).getLeange ();
        }

        return sum_leange / filme.size ();
    }

    public List<Film> getFilmeNachLaenge(){

        List<Film> temp = new ArrayList<> (this.filme);
        List<Film> out = new ArrayList<> ();

        while(temp.size () != 0){
            Film tmp = temp.get (0);
            for(int i = 1; i < temp.size (); i++){
                if(tmp.getLeange () > temp.get (i).getLeange ()) tmp = temp.get(i);
            }

            out.add (tmp);
            temp.remove (tmp);

        }

        return out;

    }
}
