package JavaBasic;

public class Human {
    // fields - variables in given object
    private String name;
    private Boolean isMale;
    private String eyesColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public Human(String name, Boolean isMale, String eyesColor) {
        this.name = name;
        this.isMale = isMale;
        this.eyesColor = eyesColor;
    }
}
