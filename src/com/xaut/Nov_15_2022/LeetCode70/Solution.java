package com.xaut.Nov_15_2022.LeetCode70;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        long startMethod1 = System.currentTimeMillis();
        System.out.println(Method1(23));
        System.out.println(System.currentTimeMillis() - startMethod1);

        long startMethod2 = System.currentTimeMillis();
        System.out.println(Method2(23));
        System.out.println(System.currentTimeMillis() - startMethod2);

        long startMethod3 = System.currentTimeMillis();
        System.out.println(Method3(23));
        System.out.println(System.currentTimeMillis() - startMethod3);
    }

    public static int Method1(int n) {
        if(n == 1) return 1;
        if(n ==2) return 2;

        int count = 0;
        int pre = 2;
        int prepre = 1;

        for(int i = 3; i <= n; i++){
            count = pre + prepre;
            prepre = pre;
            pre = count;
        }

        return count;
    }

    public static int Method2(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        return Method2(n - 2) + Method2(n - 1);
    }

    private static final Map<Integer, Integer> hashMap = new HashMap<>();
    private static int Method3(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        if(hashMap.get(n) != null) {
            return hashMap.get(n);
        }else {
            int count = Method2(n - 2) + Method2(n - 1);
            hashMap.put(n,count);
            return count;
        }
    }
}
