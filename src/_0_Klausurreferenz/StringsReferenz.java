package _0_Klausurreferenz;

public class StringsReferenz {

    public static void main(String[] args) {

        // Wrapper

        int a = Integer.parseInt("42"); // a = 42
        int max = Integer.max(23, 42); // max = 42
        int min = Integer.min(23, 42); // min = 23
        int sig = Integer.signum(-42); // sig = -1
        boolean c = Character.isAlphabetic('a'); // true
        boolean s = Character.isWhitespace('\n'); // true
        boolean m = Character.isMirrored('{'); // true { -> }
        String t = Boolean.toString(true); // "true"
        boolean b = Boolean.parseBoolean("True"); // true
        boolean f = Boolean.parseBoolean("yes"); // false

        // ▪ Erzeugung

        String s1 = new String(); // leerer String
        String s2 = "Java Übungen";
        String s3 = new String(s2);
        char[] array = { 'J', 'a', 'v', 'a' };
        String s4 = new String(array);

        // ▪ Einige Methoden

        int laenge = s2.length(); // Länge
        int platz = s2.indexOf('-'); // Stelle wo - vorkommt
        // die meisten Suchmethoden funktionieren mit char oder String
        int letztesA = s2.lastIndexOf("a"); // letztes a

        // ▪ Prä- und Postfix-Methoden

        boolean beginnt = s2.startsWith("Java"); //true
        boolean endet = s2.endsWith("ung"); //true

        // ▪ Zerlegung von Strings

        //String film[] = f.split("---"); gibt Array zurück mit substrings z. B. f = "Star Wars---180" -> film = ["Star Wars", "180"],

        String java = s2.substring(0, 4); //Java
        String vorlesung = s2.substring(5); // Übungen

        // ▪ Strings in Großbuchstaben oder in Kleinbuchstaben umwandeln:

        String jg = s2.toUpperCase();
        String vk = s2.toLowerCase();
        String mitLeer = " sowas kommt oft aus ner Datenbank ";
        String ohneLeer = mitLeer.trim();

        // Integer to String
        int alter = 42;
        String alterAlsText = String.valueOf(alter);

        //String to integer

        /*
        Use Integer.parseInt() to Convert a String to an Integer.
        This method returns the string as a primitive type int.

        Use Integer.valueOf() to Convert a String to an Integer.
        This method returns the string as an integer object.
         */
        //-------------------------------------------------------------------------------------------------------------------
        // Ausgabe

        // private static final String ausgabeFormat = "Konto '%s' hat einen Stand von %5d EUR und einen Zinssatz von %4.1f%%.%n";
        /*
        Konto '0815' hat einen Stand von 150 EUR und einen Zinssatz von 2,0%.
        Konto '4711' hat einen Stand von 300 EUR und einen Zinssatz von 3,0%.
        Konto 'N-EU' hat einen Stand von 0 EUR und einen Zinssatz von 1,0%.
         */

        // "%2$09d EUR sind bei einem Zinssatz von %3$5.2f%% auf Konto '%1$8s'.%n"
        /*
        000000150 EUR sind bei einem Zinssatz von 2,00% auf Konto ' 0815'.
        000000300 EUR sind bei einem Zinssatz von 3,00% auf Konto ' 4711'.
        000000000 EUR sind bei einem Zinssatz von 1,00% auf Konto ' N-EU'.
         */
        //-----------------------------------------------------------------------------------------------------------------
        //Regex

        /*

        string.replaceAll(regex, replacement);
        string.replaceFirst(regex, replacement);
        boolean yesno = string.matches(regex);

         */

        /*
        .	Any character (may or may not match line terminators)
        \d	A digit: [0-9]
        \D	A non-digit: [^0-9]
        \s	A whitespace character: [ \t\n\x0B\f\r]
        \S	A non-whitespace character: [^\s]
        \w	A word character: [a-zA-Z_0-9]
        \W	A non-word character: [^\w]
        Pattern format = Pattern.compile("(\\d*)[,](\\d*)([,](\\d*[.]\\d*))?");
        (\\d*) 0-9 beliebig oft
        [,] ein Komma

         */

        /*
        Regulärer Ausdruck Entsprechungen
        ja(va)* --- ja, java, javava, javavavava
         ja(va)+ --- java, javava, javavavava
        ja|va --- ja, va
        j(a|v)*a --- ja, jaa, jva, java, jvaa, jaaaaa, jvva
        (java)* --- <nichts>, java, javajava, javajavajava
         */

        String str = "Hello, World_123!!";
        str = str.replaceAll("[^a-zA-Z_0-9]", ""); //HelloWorld_123

        String str1 = "Hello, World_123!!";
        str = str1.replaceAll("[^a-zA-Z]", ""); // HelloWorld


    }
}
