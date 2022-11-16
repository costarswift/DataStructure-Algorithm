package com.xaut.RomanNumToInt;

import com.xaut.RomanNumToInt.Method.Method1;
import com.xaut.RomanNumToInt.Method.Method2;

public class RomNumToInt_test {
    public static void main(String[] args) {
        Method1 method1 = new Method1();
        int ans = method1.romanToInt("MMMMMMMMMMMMMMMMMMMCMXCIV");
        System.out.println(ans);

        Method2 method2 = new Method2();
        int ans2 = method2.romanToInt("MMMMMMMMMMMMMMMMMMMCMXCIV");
        System.out.println(ans2);
    }
}
