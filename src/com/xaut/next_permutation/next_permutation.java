package com.xaut.next_permutation;

import java.util.Arrays;

public class next_permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,6,5,4};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void nextPermutation(int[] nums){
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if (i >= 0){
            int j = nums.length - 1;
            while (j > i && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums,i);
    }

    private static void reverse(int[] nums, int i) {
        int left = i + 1;
        int right = nums.length - 1;
        while(right > left){
            swap(nums,right,left);
            right--;
            left++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }
}
