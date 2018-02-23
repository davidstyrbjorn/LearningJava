package com.collections;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args){
        System.out.println("Linked List example");

        /*
        Linked list extends AbstractSequentialList and implements List interface
        It is doubly-linked meaning node->next and node->previous
         */

        /*
        This won't work because the type must extend java.lang.Object
        int does not do this, instead use Integer which is a wrapper for int
         */
        // List<int> integerList = new LinkedList<int>();
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(123);
        integerList.add(90);
        //ListUtility.printListElements(integerList);

        LinkedList<String> emptyStringList = new LinkedList<>();
        //ListUtility.printListElements(emptyStringList);

        LinkedList<String> notEmptyStringList = new LinkedList<>(Arrays.asList("Hello", "Hello2", "Final Hello"));
        //ListUtility.printListElements(notEmptyStringList);
        notEmptyStringList.set(0, "Set Hello");

        List<String> subList = notEmptyStringList.subList(0, 1 + 1);
        //ListUtility.printListElements(subList);

        int temp = integerList.poll();
        //System.out.println(temp);

        integerList.offer(10); // Adds as the tail (last element)
        integerList.offerFirst(0); // Adds as the front of the list (this also removes 123 from the list)
        // The list now: 0, 90, 10
        integerList.remove(); // Retrieves and removes the head (first element) of this list.
        integerList.remove(); // List now: 10

        // Adding some more number to the integerList
        for(int i = 0 ; i < 50; i++){
            // boolean add(); Appends the specified element to the end of this list.
            integerList.add((int)(Math.E * i));
        }
        System.out.println("Size of integer list now: " + integerList.size());
        // Removing some of the numbers
        integerList.removeAll(Arrays.asList((int)(3*Math.E), (int)(6*Math.E)));
        System.out.println("Size of integer list after removing some numbers: " + integerList.size());
        // LinkedList -> dynamic size

        ListUtility.printListElements(integerList);

    }

}
