package com.xaut.List;


import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);

        System.out.println(linkedList.peek());
        linkedList.add(5);

        System.out.println(linkedList);

        System.out.println(linkedList.pop());

        System.out.println(linkedList);

        System.out.println(linkedList.poll());

        System.out.println(linkedList);


        System.out.println(linkedList);
    }
}
