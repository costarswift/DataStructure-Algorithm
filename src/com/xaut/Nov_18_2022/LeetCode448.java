package com.xaut.Nov_18_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int num : nums){
            nums[(num - 1) % n] += n;
        }

        List<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            if(nums[i] <= n){
                res.add(i + 1);
            }
        }

        return res;
    }
}
