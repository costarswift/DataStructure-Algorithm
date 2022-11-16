package com.xaut.firstAndLast;

import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,5,6};
        System.out.println(Arrays.toString(searchRange(arr,5)));
    }


    private static int[] searchRange(int[] nums, int target){
        int n = nums.length;
        if (target < nums[0] || target > nums[n-1] || n == 0) {
            return new int[]{-1,-1};
        }

        int firstIndex = findFirstIndex(nums,target);
        int lastIndex = findLastIndex(nums,target);

        return new int[]{firstIndex, lastIndex};
    }

    private static int findLastIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (target < nums[mid]){
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;

    }

    private static int findFirstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (target < nums[mid]){
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
}
