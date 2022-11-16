package com.xaut.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        System.out.println(stack.search(4));

        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.search(1));
        stack.pop();
        stack.pop();


        System.out.println(stack);
    }
}
