package JavaAdvanced.Day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
    public static void main(String[] args) throws IOException {
        // reading settings from file
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");

        // assign settings from file
        properties.load(fis);

        // save parameters
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");
        String driver = properties.getProperty("jdbc.driver");
        String local = properties.getProperty("jdbc.local", "PL");

        System.out.println(username);
        System.out.println(password);
        System.out.println(driver);
        System.out.println(local);
    }
}
