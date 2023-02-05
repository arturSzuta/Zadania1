package JavaAdvanced.Day1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {
        // declare variable FileReader and FileWriter.
        // initialize block try -> finally
        // in block try assign objects to change
        // in finally we are closing objects

        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("file.txt");
            out = new FileWriter("user_output3.txt");

            int nextChar;
            while((nextChar = in.read()) != -1) {
                out.append((char) nextChar);
                System.out.println("Pobrany znak: " + nextChar);
            }
        } finally {
            if(in != null) in.close();
            if(out != null) out.close();

        }
    }
}
