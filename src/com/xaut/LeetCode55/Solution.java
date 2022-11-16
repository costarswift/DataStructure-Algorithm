package com.xaut.LeetCode55;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int[] nums1 = {2,0,1,1,4};
        int[] nums2 = {3,2,1,0,4};

        System.out.println(canJump(nums));
        System.out.println(canJump(nums1));
        System.out.println(canJump(nums2));

    }

    public static boolean canJump(int[] nums) {
        if (nums[0] == 0) return nums.length == 1;

        int step = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0 || nums[i] < step) {
                step += 1;
            } else {
                step = 1;
            }
        }
        return step == 1;
    }
}
