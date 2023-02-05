package JavaBasic;

import java.util.HashMap;

public class App5 {
    public static void main( String[] args ) {
        HashMap<String, Integer> groceries1 = new HashMap<>();
        groceries1.put("eggs", 5);
        groceries1.put("beacon", 3);
        groceries1.put("bread", 2);

        HashMap<String, Integer> groceries2 = new HashMap<>();
        groceries2.put("eggs", 5);
        groceries2.put("beacon", 3);
        groceries2.put("bread", 3);

        if (groceries1.size() != groceries2.size()) {
            System.out.println("Maps are not the same");
        }
        else if(groceries1.equals(groceries2)) {
            System.out.println("Booth maps are the same");
        }
        else {
            System.out.println("Booth maps are not the same");
        }
    }
}
