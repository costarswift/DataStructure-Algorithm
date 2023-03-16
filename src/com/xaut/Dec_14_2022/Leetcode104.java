package com.xaut.Dec_14_2022;

import com.xaut.Library.TreeNode;

public class Leetcode104 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
