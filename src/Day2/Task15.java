package Day2;

import java.lang.reflect.Array;

public class Task15 {
    public static void main(String[] args) {
        String[] input1 = {"Ala","ma","kota"};
        String[] input2 = {"Ala","ma","kota"};

        System.out.println(isEqual(input1,input2));

    }
    private static boolean isEqual(String[] input1,String[] input2) {
        boolean isEqual = true;
        if(input1.length != input2.length) {
            isEqual = false;
        } else {
            for(int i = 0; i < input1.length; i++) {
                if(!input1[i].equals(input2[i])) {
                    isEqual = false;
                }
            }
        }
        return isEqual;
    }
}
