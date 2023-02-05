package JavaAdvanced.Day2;

public class Cat extends Animals{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(name + ": Mrauuuu!");
    }
    @Override
    public void makeSound() {
        makeNoise();
    }

    // Overload example
    public void print(String text){
        System.out.println("Accepts string");
    }
    public void print(){
        System.out.println("No arguments");
    }
}
