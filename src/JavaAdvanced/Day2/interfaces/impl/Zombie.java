package JavaAdvanced.Day2.interfaces.impl;

import JavaAdvanced.Day2.interfaces.HousePet;

public class Zombie implements HousePet {

    @Override
    public void sound() {
        System.out.println("Uuuuuuu!");
    }

    @Override
    public void makeSound() {
        System.out.println("Uuuuuuu!");
    }
}
