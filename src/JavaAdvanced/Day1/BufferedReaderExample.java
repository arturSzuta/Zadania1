package JavaAdvanced.Day1;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("user.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("user_output2.txt"));

        String line;
        while((line = in.readLine()) != null) {
            out.write(line);
            out.append("\n");
        }
        in.close();
        out.close();
    }
}
