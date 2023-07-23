package _0000_Einstufungstest.A;
import java.time.LocalDate;
class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Herr", "Donald", "Duck", LocalDate.parse("2000-01-08"));
        Person p2 = new Person("Herr", "Rober", "Duck", LocalDate.parse("2001-01-08"));

        System.out.println (p1);
        System.out.println (p2);
    }
}
