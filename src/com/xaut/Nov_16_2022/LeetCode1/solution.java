package com.xaut.Nov_16_2022.LeetCode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int[] nums = {1,3,2,14,22,15,9,12};
        System.out.println(Arrays.toString(Method1(nums, 11)));
    }

    private static int[] Method1(int [] nums, int target){
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(target - nums[i]) == null){
                hashMap.put(nums[i], i);
            }else {
                res[0] = hashMap.get(target - nums[i]);
                res[1] = i;
            }
        }
        return res;
    }
}
