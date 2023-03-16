package com.xaut.Dec_24_2022;

public class Leetcode509 {
    public static void main(String[] args) {
        System.out.println(fib3(10));
    }
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int fib2(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int prepre = 0;
        int pre = 1;
        int ans = 0;
        for (int i = 1; i < n; i++){
            ans = pre + prepre;
            prepre = pre;
            pre = ans;
        }

        return ans;
    }

    public static int fib3(int n) {
        return n <= 1 ? n : fib3(n - 2) + fib3(n - 1);
    }
}
