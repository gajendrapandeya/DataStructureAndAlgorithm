package com.codermonkeys.stack;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input) {

        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> st = new Stack<>();

        for (char ch : input.toCharArray())
            st.push(ch);

        var string = new StringBuffer();
        while (!st.isEmpty())
            string.append(st.pop());

        return string.toString();
    }

}
