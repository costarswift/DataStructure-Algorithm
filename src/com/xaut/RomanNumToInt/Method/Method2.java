package com.xaut.RomanNumToInt.Method;

import java.util.HashMap;

public class Method2 {
    public int romanToInt(String s) {
        int n = s.length();
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        for (int i = 0; i < n; i++) {
            if(i < n-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res -= map.get(s.charAt(i));
            }else{
                res += map.get(s.charAt(i));
            }
        }

        return res;
    }
}
