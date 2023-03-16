package com.xaut.Dec_14_2022;


import com.xaut.Library.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode94 {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        recursion(root, ans);
        return ans;
    }

    private void recursion(TreeNode srcNode, List<Integer> ans){
        if (srcNode == null) return;
        recursion(srcNode.left, ans);
        ans.add(srcNode.val);
        recursion(srcNode.right, ans);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
}
