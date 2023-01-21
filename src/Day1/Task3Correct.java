package Day1;

import java.util.Scanner;

public class Task3Correct {
    private static final float BMI_MIN_RANGE = 18.5F;
    private static final float BMI_MAX_RANGE = 24.9F;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int height = getHeight();
        float weight = getWeight();

        float BMI = calculateBMI(weight, height);
        displayBMI(BMI);
        System.out.println(BMI);

    }
    public static float getWeight() {
        System.out.print("Weight");
        return scanner.nextFloat();
    }
    public static int getHeight() {
        System.out.print("Height");
        return scanner.nextInt();
    }
    private static float calculateBMI (float weight, int height) {
        float heightInMeter = height / 100F;
        return weight / (heightInMeter * heightInMeter);
    }
    private static void displayBMI (float BMI) {
        if(BMI >= BMI_MIN_RANGE && BMI <=BMI_MAX_RANGE) {
            System.out.println("Is correct");
        }
        else {
            System.out.println("Is not correct");
        }
    }
}