package JavaAdvanced.Day2;

import JavaAdvanced.Day2.interfaces.HousePet;
import JavaAdvanced.Day2.interfaces.MediaPlayer;
import JavaAdvanced.Day2.interfaces.impl.GuineaPig;
import JavaAdvanced.Day2.interfaces.impl.MediaPlayerImpl;
import JavaAdvanced.Day2.interfaces.impl.Zombie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        System.out.println("*********");

        HousePet pig = new GuineaPig();
        GuineaPig pig2 = new GuineaPig();

        HousePet zombie1 = new Zombie();
        Zombie zombie2 = new Zombie();

        HousePet[] listOfAnimals = {pig,pig2,zombie1,zombie2};
        for (HousePet x: listOfAnimals){
            x.makeSound();
        }
        System.out.println("*********");
        MediaPlayerImpl mediaPlayer = new MediaPlayerImpl();
        mediaPlayer.next();
        System.out.println(mediaPlayer.getName());
        mediaPlayer.stop();
        System.out.println(MediaPlayerImpl.INTERFACE_NAME);
        System.out.println(MediaPlayer.getInterfaceName());

        List<String> names = new ArrayList<>();
        names.add("Will");
        names.add("Mike");
        names.add("Bob");

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
    }

}
