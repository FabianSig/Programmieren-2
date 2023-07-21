package _09_Uebungen_Collections.Aufgabe_2_4;

import java.util.Comparator;

class WarenBezeichnungComparator implements Comparator {


    public int compare(Object w1, Object w2){
        if(w1 instanceof Ware && w2 instanceof Ware){
            return ((Ware) w1).getBezeichnung ().compareTo (((Ware) w2).getBezeichnung ());
        }
        return 0;
    }

}
