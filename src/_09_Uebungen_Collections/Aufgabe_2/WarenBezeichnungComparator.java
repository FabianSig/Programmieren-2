package _09_Uebungen_Collections.Aufgabe_2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class WarenBezeichnungComparator implements Comparator {


    public int compare(Object w1, Object w2){
        if(w1 instanceof Ware && w2 instanceof Ware){
            return ((Ware) w1).getBezeichnung ().compareTo (((Ware) w2).getBezeichnung ());
        }
        return 0;
    }

}
