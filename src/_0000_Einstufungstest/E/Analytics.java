package _0000_Einstufungstest.E;

import java.util.List;
import java.util.stream.Collectors;

public class Analytics {

    public static List<Person> containsBindestrich(List<Person> personen){
        return personen.stream ().filter (person -> person.getNachname ().contains ("-")).collect(Collectors.toList());
    }

    public static int nHinterlegteAdressen(List<Person> personen, int n){
        return (int) personen.stream ().filter (person -> person.getAdressen ().size () >= n).count ();
    }
}
