package com.codermonkeys.queue;

import java.util.Arrays;



public class ArrayQueue {
    private int[] items;
    private int front;
    private int count;
    private int rare;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if(isFull())
            throw new IllegalStateException();

        items[rare] = item;
        rare = (rare + 1) % items.length;
        count++;
    }

    public int dequeue() {

        if(isEmpty())
            System.out.println("empty");

        var item =  items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count --;
        return item;
    }

    public boolean isEmpty() {
        return front == rare;
    }

    public int peek() {
        return items[front];
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
