package com.xaut.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.set(4,6);//edit

        arrayList.remove(4);



        System.out.println(arrayList);

        String[] s = new String[3];
        s[0] = "1";
        s[1] = "2";
        s[2] = "3";

        Object[] objects = Arrays.stream(s).toArray();
        for (Object i : objects) {
            System.out.println(i);
        }
    }
}
