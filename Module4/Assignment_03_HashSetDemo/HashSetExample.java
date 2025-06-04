package Assignment_03_HashSetDemo;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("fig");
        set.add("banana");
        System.out.println(set.size());
        set.iterator().forEachRemaining(System.out::println);
    }
}
