package Day2;

import static Day2.StringValidator.isValid;

public class Task8 {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF = 32;
    public static void main(String[] args) {
        String input = "Ala ma kota i swinie";

        System.out.println(replacement(input));

    }
    private static String replacement(String input) {
        if(isValid(input)) {
            //String result = "";
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if(currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) {
                    result.append((char)(currentChar + DIFF));
                } else if (currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) {
                    result.append((char)(currentChar - DIFF));
                } else {
                    result.append(currentChar);
                }
            }
            return result.toString();
        }
        return input;
    }
}
