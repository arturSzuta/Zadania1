package JavaAdvanced.Day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("user.txt");
        FileWriter out = new FileWriter("user_output.txt");

        int nextChar;
        while((nextChar = in.read()) != -1) {
            System.out.println("Pobrany znak: " + nextChar + " to: " + (char)nextChar);
            out.append((char)nextChar);
        }
        in.close();
        out.close();
    }
}