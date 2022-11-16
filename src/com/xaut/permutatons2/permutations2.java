package com.xaut.permutatons2;

import java.util.*;

public class permutations2 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        solution(nums).forEach(System.out::println);
    }

    private static List<List<Integer>> solution(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        Arrays.sort(nums);

        dfs(nums, len, 0, new boolean[len], new ArrayDeque<>(), res);

        return res;
    }

    private static void dfs(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; ++i) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            path.addLast(nums[i]);
            used[i] = true;

            dfs(nums, len, depth + 1, used, path, res);

            used[i] = false;
            path.removeLast();
        }
    }
}
