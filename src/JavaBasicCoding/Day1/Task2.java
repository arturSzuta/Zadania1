package JavaBasicCoding.Day1;

import java.util.Scanner;

public class Task2 {
    //private static final float PI =3.14F;
    private static final double PI = Math.PI;
    public static void main(String[] args) {
        float diameter = getDiameterFromUser();
        float circumference = calculateCircumference0fCircle(diameter);
        float area = calculateAreaOfCircle(diameter);
        System.out.println("Circumference Of A Circle: " + circumference);
        System.out.println("Area Of A Circle: " + area);

    }

        private static float getDiameterFromUser () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please insert diameter: ");
            return scanner.nextFloat();
        }

        private static float calculateCircumference0fCircle(float diameter) {
            // 2 * pi * radius
            return 2 * (float)PI * diameter /2;
            }

        private static float calculateAreaOfCircle(float diameter) {
            // pi * radius^2
            return (float)PI * diameter / 2 * diameter / 2;
            }
}
