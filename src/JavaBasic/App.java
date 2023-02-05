package JavaBasic;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // First exercise. Power of
        Scanner reader = new Scanner(System.in);

        System.out.print("(First exercise) Enter first number:");
        Integer x = reader.nextInt();
        System.out.print("(First exercise)Enter second number:");
        Integer y = reader.nextInt();

        Integer count = 1;
        Integer result = 1;

        while (count <= y) {
            result *= x;
            count ++;
        }
        System.out.println("First result: " + result);

        // Second exercise
        // Factorial a!
        Scanner reader2 = new Scanner(System.in);

        System.out.print("(Second exercise) Enter a number:");
        Integer z = reader2.nextInt();
        Integer factorial = 1;
        for (int i = 1; i <= z; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }

        // Third exercise
        Scanner reader3 = new Scanner(System.in);

        System.out.print("(Third exercise) Enter a number:");
        Integer ghi = reader3.nextInt();
        for (int i = 1; i <= ghi; i++) {

            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        // Fourth exercise
        Scanner reader4 = new Scanner(System.in);

        System.out.print("(Fourth exercise)Enter a number:");
        Integer c = 0;
        Integer d = 1;
        Integer e = reader4.nextInt();
        for (int j = 0; j <= e; j++) {
            System.out.println(c + ", ");
            Integer f = c + d;
            c = d;
            d = f;
        }
    }
}
