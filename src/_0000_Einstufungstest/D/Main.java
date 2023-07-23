package _0000_Einstufungstest.D;

import java.time.LocalDate;

import static _0000_Einstufungstest.D.DateiErsteller.erstelleDatei;

class Main {

    public static void main(String[] args) {

        Person p1 = new Person ("Herr", "Donald", "Duck", LocalDate.parse("2000-01-08"));
        Person p2 = new Person ("Herr", "Rober", "Duck", LocalDate.parse("2001-01-08"));
        ElektronischeAdresse mail1 = new ElektronischeAdresse ("Donald@gmail.com");
        ElektronischeAdresse mail2 = new ElektronischeAdresse ("Donald2@gmail.com");
        PostalischeAdresse a1 = new PostalischeAdresse ("Grubenweg", 4, "52323", "LazyTown");
        PostalischeAdresse a2 = new PostalischeAdresse ("Grubenweg", 6, "52323", "LazyTown");

        p1.setAdressen (mail1);
        p1.setAdressen (mail2);
        p1.setAdressen (a1);
        ElektronischeAdresse mail3 = new ElektronischeAdresse ("Rober@gmail.com");
        p2.setAdressen (mail3);
        p2.setAdressen (a2);
        System.out.println (p1);
        System.out.println (p2);

        erstelleDatei(p1, p2);

    }
}
