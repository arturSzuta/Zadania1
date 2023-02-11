package JavaAdvanced.Day2.Encapsulation;

public class Prisoner {
    private final String id;
    private final String name;
    private final String lastName;

    public Prisoner(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name + " " + lastName.charAt(0) + ".";
    }
    public String getLastName(){
        return "Access denied";
    }
}
