package com.xaut.Dec_17_2022;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Leetcode20 {
    public static void main(String[] args) {
        System.out.println(isValid("({})[]"));
        System.out.println(isValid("({})[]("));
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 !=0) return false;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if (c == '{'){
                stack.push('}');
            }else if (c == '['){
                stack.push(']');
            }else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
