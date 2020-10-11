package com.codermonkeys.arrays;

import java.util.Arrays;

public class WorkingWithArray {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        int[] newNumbers = numbers.clone();
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newNumbers));
    }
}
