package JavaBasicCoding.Day2;

public class Task5 {
    public static void main(String[] args) {
        String string = "Ala ma kota";
        char character = 'z';

        System.out.println(numberOfOccurrences(character, string));
    }
    private static int numberOfOccurrences(char character, String string) {
        int counter = 0;
        if(StringValidator.isValid(string)) {
            for(int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == character) {
                counter++;
                }
            }
        }
        return counter;
    }
}

