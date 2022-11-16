package com.xaut.LeetCode50;

public class Solution {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));
        System.out.println(myPow(2, Integer.MIN_VALUE));
        System.out.println(Math.pow(2, 10));

    }

    public static double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? method(x, N) : 1.0 / method(x, -N);
    }

    public static double method(double x, long N) {
        double ans = 1.0;
        double temp = x;

        while (N > 0) {
            if (N % 2 == 1) {
                ans *= temp;
            }

            temp *= temp;
            N /= 2;
        }

        return ans;
    }
}
