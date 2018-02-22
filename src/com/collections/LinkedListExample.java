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
        List<Integer> integerList = new LinkedList<>();
        integerList.add(123);
        integerList.add(90);
        //ListUtility.printListElements(integerList);

        LinkedList<String> emptyStringList = new LinkedList<>();
        ListUtility.printListElements(emptyStringList);

        LinkedList<String> notEmptyStringList = new LinkedList<>(Arrays.asList("Hello", "Hello2", "Final Hello"));
        ListUtility.printListElements(notEmptyStringList);
    }

}
