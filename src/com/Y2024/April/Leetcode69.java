package com.Y2024.April;

/**
 * @Author Costar
 * @Date 周四 2024/4/11 22:48
 */
public class Leetcode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int mid = (right - left) / 2 + left;
        while ((mid > x / mid || (mid + 1) <= x / (mid + 1))) {
            if (mid < x / mid) {
                left = mid;
            }
            if (mid > x / mid) {
                right = mid;
            }
            mid = (right - left) / 2 + left;
        }
        return mid;
    }

    public int mySqrt1(int x) {
        return (int)Math.sqrt(x);
    }
}
