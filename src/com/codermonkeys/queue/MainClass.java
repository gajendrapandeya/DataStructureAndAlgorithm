package com.codermonkeys.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MainClass {

    public static void main(String[] args) {

       PriorityQueue queue = new PriorityQueue();
        queue.add(3);
        queue.add(7);
        queue.add(4);
        queue.add(1);
        System.out.println(queue);

        while (!queue.isEmpty())
            System.out.println(queue.remove());

    }


}
