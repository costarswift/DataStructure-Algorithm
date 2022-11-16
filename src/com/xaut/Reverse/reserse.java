package com.xaut.Reverse;

public class reserse {

    public static void main(String[] args) {
        int ans = reserse1(321);
        int ans2 = reserse1(-2147483648);
        int ans3 = reserse1(2147483647);
        int ans4 = reserse1(2147483641);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }

    private static int reserse1(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

}
