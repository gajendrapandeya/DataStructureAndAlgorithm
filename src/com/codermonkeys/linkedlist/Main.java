package com.codermonkeys.linkedlist;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var linkedList = new LinkedList();
        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        var array = linkedList.toArray();
        System.out.println(linkedList.getKthNodeFromTheEnd(0));
    }
}
