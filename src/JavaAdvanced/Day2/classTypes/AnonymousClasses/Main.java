package JavaAdvanced.Day2.classTypes.AnonymousClasses;

import JavaAdvanced.Day2.Animals;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals() {
            @Override
            public void makeSound() {
                System.out.println("Anonymous Class");
            }
        }
    }
}
