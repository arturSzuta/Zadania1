package JavaAdvanced.Day2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // wielopostaciowosc
        Maja maja = new Maja();
        Mike mike = new Mike();
        Kowalscy[] array = {mike, maja};

        for(Kowalscy x: array){
            System.out.println(x);
        }

        Dog dog1 = new Dog("Tina");
        Dog dog2 = new Dog("Ivan");

        Cat cat1 = new Cat("Dot");
        Cat cat2 = new Cat("Pip");

        Dog[] dogs = {dog1, dog2};

        for(Dog x : dogs) {
            x.bark();
        }
         Cat[] cats = {cat1,cat2};

        for(Cat x : cats) {
            x.makeNoise();
        }
        Animals[] animals = {dog1, dog2, cat1,cat2};
        for(Animals animal : animals) {
            animal.makeSound();
        }
    }

}
