package Day2;

import java.lang.reflect.Array;

public class Task15 {
    public static void main(String[] args) {
        String[] input1 = {null,"ma","kota"};
        String[] input2 = {"null","ma","kota"};

        System.out.println(isEqual(input1,input2));

    }
    private static boolean isEqual(String[] input1,String[] input2) {

        if(input1.length != input2.length) {
            return false;
        } else {
            for(int i = 0; i < input1.length; i++) {
                if(input1[i] == null && input2[i] == null) {
                    continue;
                }
                if(input1[i] == null || !input1[i].equals(input2[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
