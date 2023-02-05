package JavaBasicCoding.Day2;

import static JavaBasicCoding.Day2.StringValidator.isValid;

public class Task1 {
    private static final char DEFAULT_CHAR = '\u0000';
    public static void main(String[] args) {
        String input = null;
        char output = getLastCharacter(input);

        System.out.println(output);

    }
    private static char getLastCharacter(String input) {
        if(isValid(input)){
            return input.charAt(input.length() - 1);
        }
        return DEFAULT_CHAR;
    }
}
