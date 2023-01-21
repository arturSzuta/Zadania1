package Day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();

        System.out.println("If x is greater than y: " + isGreater(x, y));
        System.out.println("If x * 3 is greater than y: " + x3IsGreater(x, y));
        System.out.println("If y++ ...: " + postinc(x, y));
        System.out.println("If x * y is even: " + isEven(x, y));


    }
    public static boolean isGreater (int x,int y) {
        if (x > y) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean x3IsGreater (int x, int y) {
        if (x * 3 > y) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean postinc (int x, int y) {
        if (y++ < ++x && --y < y++) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isEven (int x, int y) {
        if (x == y) {
            return true;
        }
        else {
            return false;
        }
    }
}
