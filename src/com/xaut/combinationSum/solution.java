package com.xaut.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class solution {

    public static void main(String[] args) {


        int[] nums = {2, 3, 6, 7};
        solution solution = new solution();
        System.out.println(solution.combinationSum(nums, 6).toString());


    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = candidates.length;
        if (n == 0) {
            return ans;
        }

        backTrace(candidates, target, n, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backTrace(int[] candidates, int target,
                                  int n, int begin, ArrayList<Integer> path, List<List<Integer>> ans){
        if (begin >= n || target < 0){
            return;
        }

        if (target == 0){
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < n; i++) {
            path.add(candidates[i]);
            backTrace(candidates,target - candidates[i], n, i, path, ans);
            path.remove(path.size() - 1);
        }
    }
}
