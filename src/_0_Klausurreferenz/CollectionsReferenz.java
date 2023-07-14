package _0_Klausurreferenz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectionsReferenz {

    public static void main(String[] args) {

        List<String> s = Arrays.asList("1", "2", "3", "4", "5", "Apfel", "Banane", "Banane", "Trauben", "Kiwi", "Orange");
        s = s.stream ().distinct ().collect(Collectors.toList());

        // Iterieren
        Iterator iter = s.iterator ();
        while(iter.hasNext ()){
            System.out.println (iter.next ());
        }








    }

    /*
    Jede Collection (nicht Map) verfügt über folgende Methoden, die bereits im Interface
    java.util.Collection deklariert sind:

    Einfügen: boolean add(Object o)
    boolean addAll(Collection coll)

    Löschen: boolean remove(Object o)
    boolean removeAll(Collection c)
    void clear()

    Abfragen: boolean contains(Object o)
    boolean containsAll(Collection coll)
    int size()
    boolean isEmpty()

    Schnittmenge: boolean retainAll(Collection coll)

    Iterator: Iterator iterator()

    Kopie in ein Array: Object[] toArray()
    Object[] toArray(Object[] a)
     */

    /*
    An einer bestimmten
    Stelle einfügen:
    void add(int index, Object o)
    boolean addAll(int index, Collection c)
    Ersetzen: Object set(int index, Object o)
    Holen und löschen: Object remove(int index)
    Index abfragen: int indexOf(Object o)
    int lastIndexOf(Object o)
    Holen: Object get(int index)
    List subList(int vonIndex, int bisIndex)
    List-Iteratoren: ListIterator listIterator()
    ListIterator listIterator(int startIndex)
     */
}
