package _000_TestCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test.txt");

        try {
            List<String> content = Files.readAllLines(path);
            Collections.shuffle (content);
            for (String s: content) {
                System.out.println (s + "\n\n\n\n\n\n\n\n\n");
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

}
