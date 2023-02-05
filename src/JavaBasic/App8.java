package JavaBasic;

import java.util.Scanner;

public class App8 {
    static public void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        if (name.equals("")) {
            System.out.println("Hello, Stranger!");
        }
        else {
            System.out.println("Hello, " + name);
        }
    }
}
