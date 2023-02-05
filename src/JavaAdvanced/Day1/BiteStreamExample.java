package JavaAdvanced.Day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BiteStreamExample {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("user.txt");
            out = new FileOutputStream("user_output.txt");

            int c;
            while ((c = in.read()) != -1){
                out.write(c);
                System.out.println(c);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
