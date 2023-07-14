package _0_Klausurreferenz;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

class Referenz {

    /*****************
     *
     *
     * Streams
     *
     *
     *****************/



    public List<BeispielObjekt> listeAufsteigendSortieren(List<BeispielObjekt> liste){
        // .getIntegerAttribut mit passendem Getter ersetzen
        // nur sortieren nicht zurückgeben liste.sort(Comparator.comparing (BeispielObjekt::getIntegerAttribut));
        // oder liste.sort(Comparator.comparing (o -> o.getIntegerAttribut));

        return liste.stream ()
                .sorted (Comparator.comparing (BeispielObjekt::getIntegerAttribut))
                .collect (toList ());

    }

    public int listeSummieren(List<BeispielObjekt> liste){

        return  liste.stream ()
                .mapToInt (BeispielObjekt::getIntegerAttribut)
                .sum();
    }

    public BeispielObjekt ObjektMaxVal(List<BeispielObjekt> liste){
        //Maximum finden
        //Analog hierzu ObjektMinVal statt .max -> .min

        return liste.stream()
                .max(Comparator.comparingInt(BeispielObjekt::getIntegerAttribut))
                .get();
    }

    public List<BeispielObjekt> filterList(List<BeispielObjekt> liste){

        return liste.stream ().filter (o -> o.getIntegerAttribut () > 0).collect(toList());
    }


    /*****************
     *
     *
     * Strings
     *
     *
     *****************/

    public String[] stringAufteilen(String s){
        //teilt einen String anhand des gegebenen Strings auf
        return s.split("---");
    }
}


