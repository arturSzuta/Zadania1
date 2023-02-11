package JavaAdvanced.Day2.Composition;

public class Tv {
    private int size;
    private String type;

    @Override
    public String toString() {
        return "Tv{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }

    public Tv(int size, String type) {
        this.size = size;
        this.type = type;
    }
}
