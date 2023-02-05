package JavaBasic;

import java.util.HashSet;

public class App6 {
    public static void main( String[] args ) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(5);
        hashSet2.add(3);

        HashSet<Integer> setUnion = new HashSet<>(hashSet1);

        setUnion.addAll(hashSet2);

        System.out.println("Set union" + setUnion);

        HashSet<Integer> setIntersection = new HashSet<>(hashSet1);
        setIntersection.retainAll(hashSet2);

        System.out.println("Set intersection" + setIntersection);

        HashSet<Integer> diffSetL = new HashSet<>(hashSet1);

        diffSetL.removeAll(hashSet2);

        System.out.println("Left side set difference" + diffSetL);

        HashSet<Integer> diffSetR = new HashSet<>(hashSet2);

        diffSetR.removeAll(hashSet1);

        System.out.println("Right side set difference" + diffSetR);
    }
}