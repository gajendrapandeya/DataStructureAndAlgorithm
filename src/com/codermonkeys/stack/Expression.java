package com.codermonkeys.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//Todo: Program to check if a given string is balanced or not
// Input: "( a + b ) => output : true
// Input: "( a + b   => output : false
// Input: "( a + b (  => output : false
// Input: ") a + b (   => output : false
// Input: "( a + b }   => output : false
// Input: "( { a + b ) }   => output : false ...........
public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '{', '[');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', '}', ']');

    public boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;

                var top = stack.pop();
                if (!bracketMatch(top, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
