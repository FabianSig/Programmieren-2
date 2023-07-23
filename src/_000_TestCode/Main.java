package _000_TestCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {

    }

    public static void reinschreiben(Person... person) {
        Path path = Paths.get("personen.txt");

        try {
            if (Files.notExists(path)) {
                Files.createFile(path);
            }

            BufferedWriter writer = Files.newBufferedWriter(path);

            for (Person value : person) {
                writer.append (value.toString ());
            }

            writer.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
