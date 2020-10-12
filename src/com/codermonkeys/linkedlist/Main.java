package com.codermonkeys.linkedlist;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addLast(10);
        linkedList.addLast(10);


        var array = linkedList.toArray();
        System.out.println(Arrays.toString(array));
    }
}
