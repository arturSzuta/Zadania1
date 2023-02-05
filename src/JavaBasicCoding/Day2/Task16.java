package JavaBasicCoding.Day2;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] array = {12, 7, 9, 5, 6};

        int[] newArray = replacementHard(array);

        System.out.println(Arrays.toString(newArray));
    }
    private static int[] replacement(int[] input) {
        int sizeOfArray = input.length - 1;
        int tmp;
        tmp = input[0];
        input[0] = input[sizeOfArray];
        input[sizeOfArray] = tmp;

        return input;
    }
    private static int[] replacementHard(int[] input) {
        int sizeOfArray = input.length - 1;
        int[] tmpArray = new int[sizeOfArray + 1];

        for(int i = 0; i <= sizeOfArray; i++) {
            tmpArray[i] = input[sizeOfArray - i];
        }
        return tmpArray;
    }
}
