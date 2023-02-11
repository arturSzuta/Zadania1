package JavaAdvanced.Day2.Composition;

public class Room {
    private Bed bed;
    private Tv tv;

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", tv=" + tv +
                '}';
    }

    public Room(Bed bed, Tv tv) {
        this.bed = bed;
        this.tv = tv;
    }
}
