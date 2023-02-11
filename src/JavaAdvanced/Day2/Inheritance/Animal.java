package JavaAdvanced.Day2.Inheritance;

public abstract class Animal {
    private final String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getSound(){
        return "Arrr!";
    }
}
