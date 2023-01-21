package Day1;

public class Task7 {
    public static void main(String[] args) {
        printPrimeNumbers(10);
    }
    private static void printPrimeNumbers(int number) {
        for(int i = 2; i < number; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                }
                }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
