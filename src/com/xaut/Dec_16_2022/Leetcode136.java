package com.xaut.Dec_16_2022;

public class Leetcode136 {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 4, 5, 4, 7, 9, 10, 10, 5, 7, 9};
        System.out.println(singleNumber(nums));
    }
}
