package Day1;

public class Task7 {
    public static void main(String[] args) {
        printPrimeNumbers(10);
    }
    private static void printPrimeNumbers(int number) {
        for(int i = 2; i < number; i++) {
            boolean isPrime = true;
                if(number % i == 0) {
                    isPrime = false;
                }
            if(isPrime) {
                System.out.print(" " + i + ",");
            }
        }
    }
}
