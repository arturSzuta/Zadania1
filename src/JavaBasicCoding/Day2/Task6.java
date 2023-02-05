package JavaBasicCoding.Day2;

public class Task6 {
    public static void main(String[] args) {
        String string = "Ala ma kota";
        char character = 'z';

        System.out.println(numberOfOccurrences(character, string));
    }
    private static int numberOfOccurrences(char character, String input) {
        if (StringValidator.isValid(input)) {
            return input.indexOf(character);
        }
        return -1;
    }
}

