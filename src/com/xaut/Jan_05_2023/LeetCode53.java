package com.xaut.Jan_05_2023;

public class LeetCode53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int subArraySum = nums[0];
        for (int i = 1; i < nums.length; i++){
            subArraySum = Math.max(nums[i], subArraySum + nums[i]);
            if(subArraySum > ans) ans = subArraySum;
        }
        return ans;
    }
}
