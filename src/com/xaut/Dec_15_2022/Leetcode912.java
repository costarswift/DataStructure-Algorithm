package com.xaut.Dec_15_2022;

import java.util.Arrays;
import java.util.Random;

public class Leetcode912 {
    public static void main(String[] args) {
        int[] nums = new int[50_000];
        Random r = new Random();
        int i = nums.length;
        while(i > 0){
            nums[--i] = r.nextInt(50_000);
        }
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(sortArray(nums)));
        /*Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));*/
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
    public static int[] sortArray(int[] nums) {
        int OFFSET = 50_000;
        int size = 100_000;
        int[] count = new int[size + 1];

        for (int x : nums) {
            count[x + OFFSET]++;
        }

        int idx = 0;
        for (int i = 0; i <= size; i++) {
            if (count[i] <= 0) {
                continue;
            }

            for (int j = 0; j < count[i]; j++) {
                nums[idx] = i - OFFSET;
                idx++;
            }
        }

        return nums;
    }
}
