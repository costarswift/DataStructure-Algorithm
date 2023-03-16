package com.xaut.Dec_15_2022;

public class Leetcode704 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(search(nums, 5));
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) >> 1;
            if(target == nums[mid]) return mid;
            if(target < nums[mid]){
                right = mid - 1;
            }
            if(target > nums[mid]){
                left = mid + 1;
            }
        }

        return -1;
    }
}
