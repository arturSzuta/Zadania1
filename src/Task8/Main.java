package Task8;

public class Main {
    public static void main(String[] args) {
        Poem poems[] = new Poem[4];
        poems[0] = new Poem(new Author("Brzechwa", "PL"), 43);
        poems[1] = new Poem(new Author("Konopnicka", "PL"), 12);
        poems[2] = new Poem(new Author("Tuwim", "PL"), 34);
        poems[3] = new Poem(new Author("Tolkien", "GB"), 344);


        int maxValue = Integer.MIN_VALUE;
        String searchAuthor = "";
        for (Poem element : poems) {
            if (maxValue < element.getStropheNumbers()) {
                maxValue = element.getStropheNumbers();
                searchAuthor = element.getAuthor().getSurname();
            }
        }

        System.out.println(searchAuthor);
    }
}

