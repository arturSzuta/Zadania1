package JavaAdvanced.Day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("user.txt");
        FileOutputStream out = new FileOutputStream("user_output.txt");
        int c;
        while((c = in.read()) != -1) {
            System.out.println(c);
            out.write(c);
        }
        in.close();
        out.close();
    }
}
