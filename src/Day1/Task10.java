package Day1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        int number = getAnumber();
        int result = calculateSumOfDigits(number);
        System.out.println("Sum Of Digits: " + result);
    }

    private static int getAnumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert digit: ");

        return scanner.nextInt();
    }
    private static int calculateSumOfDigits(int input) {
        double result = 0;
        double modInput = input;
        while(modInput > 1) {
            modInput = modInput / 10;
            double digit = (modInput % 1) * 10;
            result = result + digit;
        }
        return (int) result;
    }

}
