package JavaAdvanced.Day2;
public class Dog extends Animals{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + ": Woof!");
    }

    @Override
    public void makeSound() {
        bark();
    }
}
