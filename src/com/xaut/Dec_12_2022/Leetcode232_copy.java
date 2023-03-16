package com.xaut.Dec_12_2022;

import java.util.Stack;

public class Leetcode232_copy {
    class MyQueue {
        private static Stack<Integer> inStack = new Stack<>();
        private static Stack<Integer> outStack = new Stack<>();


        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            if (outStack.isEmpty()){
                while(!inStack.isEmpty()){
                    outStack.push(inStack.pop());
                }
            }
            return outStack.pop();
        }

        public int peek() {
            if (outStack.isEmpty()){
                while(!inStack.isEmpty()){
                    outStack.push(inStack.pop());
                }
            }
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }

    }
}
