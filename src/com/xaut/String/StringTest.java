package com.xaut.String;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "0123456789";
        String s2 = new String("0123456789");
        StringBuilder sb1 = new StringBuilder("0123456789");

        System.out.println(s1.lastIndexOf('7'));
        System.out.println(s2.lastIndexOf('7'));
        System.out.println(sb1.lastIndexOf("7"));
        System.out.println(sb1.lastIndexOf("78"));
        System.out.println(sb1.lastIndexOf("789"));

        System.out.println(s1.substring(7));
        System.out.println(s1);
        System.out.println(s2.substring(7));
        System.out.println(sb1.substring(7));
        System.out.println(sb1);

    }
}
