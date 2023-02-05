package JavaBasic;

import java.util.Scanner;

public class App3 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a length of array number 1");

        Integer lenghtOfArray1 = scanner.nextInt();

        Integer[] array1 = new Integer[lenghtOfArray1];

        scanner = new Scanner(System.in);

        for (int i = 0; i < lenghtOfArray1; i++) {
            System.out.println("Please provide a number");
            Integer number = scanner.nextInt();
            array1[i] = number;
        }
        System.out.println("Please provide a length of array number 2");

        Integer lenghtOfArray2 = scanner.nextInt();

        Integer[] array2 = new Integer[lenghtOfArray1];

        scanner = new Scanner(System.in);

        for (int i = 0; i < lenghtOfArray2; i++) {
            System.out.println("Please provide a number");
            Integer number = scanner.nextInt();
            array2[i] = number;
        }
        boolean same = true;

        if (array1.length != array2.length) {
            same = false;
        }
        else {
            for (int i = 0; i < array1.length; i++) {
                if ( array1[i] != array2[i]) {
                    same = false;
                }
            }
        }
        if (same == false) {
            System.out.println("Arrays are not the same");
        }
        else {
            System.out.println("Booth arrays are the same");
        }
    }
}
