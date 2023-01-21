package Day1;

public class Task5 {
    public static void main(String[] args) {
    int firstDigit = 4;
    int secondDigit = 11;
    System.out.println(sum(firstDigit, secondDigit));
    }

    private static int sum(int firstDigit, int secondDigit) {
        int sum = 0;
        for(int i = firstDigit; i <= secondDigit;i++) {
            sum += i;
        }
        return sum;
    }
    private static int sum2(int firstDigit, int secondDigit) {
        int sum = 0;
        while (firstDigit <= secondDigit) {
            sum += firstDigit;
            firstDigit++;
        }
        return sum;
    }
}
