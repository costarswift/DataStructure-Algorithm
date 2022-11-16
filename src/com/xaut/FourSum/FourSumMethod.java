package com.xaut.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSumMethod {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int length = nums.length;
        if (length < 4) return list;

        Arrays.sort(nums);

        for (int i = 0; i < length - 3; i++) {
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) continue;

            for (int j = i + 1; j < length - 2; j++) {
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                if ((long) nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) continue;

                int left = j + 1;
                int right = length -1;
                while(right > left){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target){
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[left] == nums[left + 1]){
                            left++;
                        }
                        left++;

                        while (right > left && nums[right] == nums[right - 1]){
                            right--;
                        }
                        right--;
                    }else if(sum < target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }

        return list;
    }
}
