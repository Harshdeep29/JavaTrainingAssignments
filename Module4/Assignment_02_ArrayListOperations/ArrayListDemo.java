package Assignment_02_ArrayListOperations;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(6);
        System.out.println(list);
        list.add(2,10);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
