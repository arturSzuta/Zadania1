package JavaBasic;

import java.util.HashSet;

public class App4 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(2);
        hashSet2.add(3);


        if (hashSet1.size() != hashSet2.size()) {
            System.out.println("Sets are not the same");
        }
        else if(hashSet1.equals(hashSet2)) {
            System.out.println("Booth sets are the same");
        }
        else {
            System.out.println("Booth sets are not the same");
        }
    }
}
