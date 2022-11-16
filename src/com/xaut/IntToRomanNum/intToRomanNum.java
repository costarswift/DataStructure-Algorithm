package com.xaut.IntToRomanNum;

import com.xaut.IntToRomanNum.Method.method;
import com.xaut.IntToRomanNum.Method.method1;

public class intToRomanNum {
    public static void main(String[] args) {
        method solution = new method();
        String ans = solution.intToRoman(19994);
        System.out.println(ans);

        method1 solution1 = new method1();
        String ans1 = solution1.intToRoman(19994);
        System.out.println(ans1);
    }
}

