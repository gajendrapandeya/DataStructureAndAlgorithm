package com.codermonkeys.queue;

import java.util.Queue;
import java.util.Stack;

public class IntegerReverser {

    public static void reverse(Queue<Integer> queue) {
        //add, isEmpty, remove

        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
