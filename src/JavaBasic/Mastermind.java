package JavaBasic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        // Asking user for level of difficulty
        int levelOfDifficulty = askForDifficulty();

        // Creating array containing random integers
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        for (int i = 0; i < levelOfDifficulty + 2; i++) {
            randomNumbers.add(getRandomInt());
        }

        // Asking user for numbers and saving them in array
        ArrayList userNumbers = getUserArray(levelOfDifficulty);


        // Comparing arrays and printing result until winner
        boolean winner = false;
        winner = checkNumbers(randomNumbers, userNumbers, levelOfDifficulty);
        while (winner == false) {
            userNumbers = getUserArray(levelOfDifficulty);
            winner = checkNumbers(randomNumbers, userNumbers, levelOfDifficulty);
        }

        // Printing goodbye message
        System.out.println("");
        System.out.println("You won!!!");
    }
    public static int askForDifficulty () {
        System.out.println("Easy - 1");
        System.out.println("Medium - 2");
        System.out.println("Hard - 3");
        System.out.println("Choose you difficulty level:");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        if (level < 1 || level > 3) {
            askForDifficulty();
        }
        return level;
    }
    public static int getRandomInt() {
        Random rand = new Random();
        int number = rand.nextInt(9 - 1 + 1) + 1;
        return number;
    }
    public static int chooseAnumber() {
        System.out.println("");
        System.out.println("Please choose a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static ArrayList getUserArray (int levelOfDifficulty) {

        ArrayList<Integer> userNumbers = new ArrayList<>();
        for (int i = 0; i < levelOfDifficulty + 2; i++) {
            userNumbers.add(chooseAnumber());
        }
        return userNumbers;
    }
    public static boolean checkNumbers(ArrayList random, ArrayList user, int levelOfDifficulty) {
        boolean winner = false;
        int matchCounter = 0;
        for (int i = 0; i < levelOfDifficulty + 2; i++) {
            if (user.get(i) == random.get(i)) {
                System.out.print("HOT ");
                matchCounter ++;
            }
            else {
                boolean warm = false;
                for (int j = 0; j < levelOfDifficulty + 2; j++) {
                    if (user.get(i) == random.get(j)) {
                        warm = true;
                    }
                }
                if (warm == true) {
                    System.out.print("WARM ");
                }
                else {
                    System.out.print("COLD ");
                }
            }
    }
        if (matchCounter == levelOfDifficulty + 2) {
            winner = true;
        }
        return winner;
}
}