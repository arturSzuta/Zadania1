package JavaAdvanced.Day2.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Prisoner prisoner = new Prisoner("1", "John", "Xyz");
        System.out.println(prisoner.getName());
        System.out.println(prisoner.getLastName());
    }
}
