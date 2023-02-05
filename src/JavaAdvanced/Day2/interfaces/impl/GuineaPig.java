package JavaAdvanced.Day2.interfaces.impl;

import JavaAdvanced.Day2.interfaces.HousePet;

public class GuineaPig implements HousePet {
    @Override
    public void sound() {
        System.out.println("Piii piii!");
    }

    @Override
    public void makeSound() {
        System.out.println("Piii piii!");
    }
}
