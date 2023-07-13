package _000_TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Main {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("test.txt");
        BufferedReader reader = Files.newBufferedReader(path);
        reader.lines().forEach(a -> System.out.println(a));
        reader.close();

    }
}
