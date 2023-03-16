package com.xaut.Dec_16_2022;

import java.util.Arrays;

public class Leetcode338 {
    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        for(int i = 1; i <= n; i++){
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

    public int[] countBits2(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i & (i - 1)] + 1;
        }
        return bits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(16)));
        System.out.println(Arrays.toString(countBits(31)));
    }
}
