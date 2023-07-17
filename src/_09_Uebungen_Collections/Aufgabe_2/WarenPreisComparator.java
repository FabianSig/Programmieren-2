package _09_Uebungen_Collections.Aufgabe_2;

import java.util.Comparator;

public class WarenPreisComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Ware && o2 instanceof Ware){
            return (int) (((Ware) o1).getPreis () - ((Ware) o2).getPreis ());
        }
        return 0;
    }
}
