package Day2;

import java.awt.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(ifStringStartsWith("programowanie", "pro"));
    }

    private static boolean ifStringStartsWith(String input, String prefix) {

        return input.startsWith(prefix);
    }
}
