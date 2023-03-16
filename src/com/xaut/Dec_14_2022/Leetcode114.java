package com.xaut.Dec_14_2022;

import com.xaut.Library.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode114 {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        recursion(root, ans);
        return ans;
    }

    private void recursion(TreeNode srcNode, List<Integer> ans){
        if (srcNode == null) return;
        ans.add(srcNode.val);
        recursion(srcNode.left, ans);
        recursion(srcNode.right, ans);
    }
}
