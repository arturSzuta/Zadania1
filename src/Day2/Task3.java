package Day2;

import static Day2.StringValidator.isValid;

public class Task3 {
    public static void main(String[] args) {

    }

    private static int getIndex( String input, String word) {
        if(isValid(input) && isValid(word)) {
            if(input.contains(word)) {
                return input.indexOf(word);
            } else {
                return -1;
            }
        }
        return -1;
    }
}
