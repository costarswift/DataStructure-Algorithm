package com.xaut.Dec_14_2022;

import com.xaut.Library.TreeNode;

public class Leetcode110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    int maxDepth(TreeNode root){
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
