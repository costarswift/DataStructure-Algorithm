package com.xaut.RomanNumToInt.Method;

import java.util.HashMap;

public class Method1 {
    public int romanToInt(String s) {
        String s1 = s.replace("IV","v")//4
        .replace("IX","x")//9
        .replace("XL","l")//40
        .replace("XC","c")//90
        .replace("CD","d")//400
        .replace("CM","m");//900

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('M',1000);
        hashMap.put('m',900);
        hashMap.put('D',500);
        hashMap.put('d',400);
        hashMap.put('C',100);
        hashMap.put('c',90);
        hashMap.put('L',50);
        hashMap.put('l',40);
        hashMap.put('X',10);
        hashMap.put('x',9);
        hashMap.put('V',5);
        hashMap.put('v',4);
        hashMap.put('I',1);

        int res = 0;

        for (int i = 0; i < s1.length(); i++){
            res += hashMap.get(s1.charAt(i));
        }

        return res;
    }
}
