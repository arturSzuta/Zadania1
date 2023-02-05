package JavaBasic;

import java.util.Scanner;

public class App9 {
    static public void main( String[] args ) {
        String name = getName();
        name = checkName(name);
        printMessage(name);
    }
    static public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        return name;
    }
    static public String checkName(String name) {
        if (name.equals("")) {
            name = "Stranger";
        }
        return name;
    }
    static public void printMessage(String name) {
        System.out.println("Hello, " + name);
    }
}
