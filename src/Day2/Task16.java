package Day2;

import java.sql.Array;
import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] array = {12, 7, 9};

        int[] newArray = replacement(array);

        System.out.println(Arrays.toString(newArray));
    }
    private static int[] replacement(int[] input) {
        int sizeOfArray = input.length - 1;
        int[] tmp = new int[sizeOfArray];
        tmp[0] = input[sizeOfArray];
        tmp[sizeOfArray] = input[0];

        return tmp;
    }
}
