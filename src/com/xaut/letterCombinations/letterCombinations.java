package com.xaut.letterCombinations;

import com.xaut.letterCombinations.Method.method;

import java.util.List;

public class letterCombinations {
    public static void main(String[] args) {
        String s = "2568";
        method m = new method();
        List<String> stringList = m.letterCombinations(s);
        System.out.println(stringList.toString());
    }
}
