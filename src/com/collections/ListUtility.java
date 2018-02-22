package com.collections;

import java.util.List;

public class ListUtility {

    public static <T> void printListElements(List<T> list){
        for(T element : list){
            System.out.println(element.toString());
        }
    }

}
