package JavaAdvanced.Day2.Composition;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed();
        bed.setName("Kings size");
        bed.setBedroomType("Main");

        Room room = new Room(bed, new Tv(65,"LCD"));
    }

}
