package JavaAdvanced.Day3.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Neeki");
        names.add("Packia");
        names.add("John");
        if (names.contains("John")){
            System.out.println("Element found");
        }
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Tree Set, sorted");
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(1);
        sortedSet.add(17);
        sortedSet.add(3);
        sortedSet.add(2);
        sortedSet.add(1);
        sortedSet.forEach(System.out::println);

        System.out.println("Lined Hash Set, keeps order");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(54);
        linkedHashSet.add(8);
        linkedHashSet.add(14);
        linkedHashSet.add(4);
        linkedHashSet.forEach(System.out::println);

        System.out.println("******");
        System.out.println("FiFo");

        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("Charmander");
        System.out.println(pokemons.poll());
        System.out.println(pokemons.peek());


        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(20);
        deque.offerLast(10);
        deque.offerFirst(12);
        deque.offer(11);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println("******");
        System.out.println("LiFo");

        Queue<Integer> lifoQueue = Collections.asLifoQueue(new ArrayDeque<>());
        lifoQueue.offer(1);
        lifoQueue.offer(2);
        lifoQueue.offer(3);
        lifoQueue.forEach(System.out::println);

        System.out.println("******");
        System.out.println("Maps");

        //tworzenie obiektu typu Map
        Map<String, Float> employees = new HashMap<>();
        //dodawania elementów do mapy
        employees.put("John Dool", 3000.0f);
        employees.put("Chao Di", 4500.0f);
        employees.put("Prasad D", 1000.0f);
        //usuwanie element z mapy o danym kluczu
        employees.remove("John Dool");
        //pobieranie elementu z mapy o danym kluczu
        System.out.println(employees.get("Prasad D"));
        for (String key : employees.keySet()) {
            System.out.println("Pracownik: " + key);
        }
        for (float value : employees.values()) {
            System.out.println("Wypłata: "+ value);
        }
        for (Map.Entry<String, Float> pair : employees.entrySet()) {
            System.out.println("Pracownik-wypłata " + pair);
        }
    }
}
