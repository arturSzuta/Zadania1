package Day2;

import static Day2.StringValidator.isValid;

public class Task4 {
    private static final String REPLACMENT = "-STOP-"
    public static void main(String[] args) {
        String input = "Ala ma kota.,."

    }
    private static String replaceString(String input) {
        if(isValid(input)) {
            /* return input
                    .replace(".", REPLACMENT)
                    .replace(",", REPLACMENT);

             */
            return input.replaceAll("", REPLACMENT)

        }
        return input;
    }
}
