package _000_TestCode;
import java.nio.file.StandardOpenOption;
import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args){
        Path writepath = Paths.get("test.txt");
        Path readpath = Paths.get("texte.txt");

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(writepath)); BufferedReader reader = Files.newBufferedReader(readpath))
        {
            String lines = reader.lines ().collect(Collectors.joining ("\n"));

            writer.println(lines);


        }
        catch (IOException e)
        {
            e.printStackTrace ();
        }






        }








}
