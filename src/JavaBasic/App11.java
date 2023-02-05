package JavaBasic;

public class App11 {
    public static void main (String[] args) {
        int count = 1; // start fizzbuzz countdown at 1
        while (count <= 100) { // fizzbuzz countdown until exceeding 100
            if (count % 15 == 0) { // if count is divisible by 15, then FizzBuzz
                System.out.println("FizzBuzz");
            }
            else if (count % 3 == 0) { // if count is divisible by 3, then Fizz
                System.out.println("Fizz");
            }
            else if (count % 5 == 0) { // if count is divisible by 5, then Buzz
                System.out.println("Buzz");
            }
            else { // in all other scenarios, display the number
                System.out.println(count);
            }

            count++; // post-increment count
        }

    }
}
