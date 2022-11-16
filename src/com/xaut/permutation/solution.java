package com.xaut.permutation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums).toString());
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int num : nums) {
            arrayList.add(num);
        }

        int n = nums.length;
        backtrack(n, arrayList, res, 0);
        return res;
    }

    public static void backtrack(int n, List<Integer> arrayList, List<List<Integer>> res, int first) {
        // 所有数都填完了
        if (first == n) {
            res.add(new ArrayList<Integer>(arrayList));
            return;
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(arrayList, first, i);
            // 继续递归填下一个数
            backtrack(n, arrayList, res, first + 1);
            // 撤销操作
            Collections.swap(arrayList, first, i);
        }
    }
}
