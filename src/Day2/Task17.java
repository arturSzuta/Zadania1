package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int[] unsortedArray = get10numbers();
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortArray(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

    }
    private static int[] get10numbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = new int[4];
        int arraySize = numbersArray.length;
        for(int i = 0; i < arraySize; i++) {
            System.out.print("Insert digit: ");
            numbersArray[i] = scanner.nextInt();
        }
        return numbersArray;
    }
    private static int[] sortArray(int[] input) {
        int arraySize = input.length;
        int[] tmpArray = Arrays.sort(input[]);



        return tmpArray;
    }
}
