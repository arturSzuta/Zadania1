package JavaBasicCoding.Day2;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] input = {12, -7, 19, - 5};

        int size = (getNegatives(input));

        int[] arraNeg = arrNeg(input, size);
        System.out.println(Arrays.toString(arraNeg));
    }

    private static int getNegatives(int[] input) {
        int negativeCounter = 0;
        for (int element : input) {
            if (element < 0) {
                negativeCounter++;
            }
        }
        return negativeCounter;
    }

    private static int[] arrNeg(int[] inputs, int size) {
        int[] result = new int[size];
        int counter = 0;
        for(int element : inputs) {
            if(element < 0) {
                result[counter] = element;
                counter++;
            }
        }
        return result;
    }
}
