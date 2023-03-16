package com.xaut.Dec_14_2022;

import com.xaut.Library.TreeNode;

public class Leetcode226 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode tem = root.left;
        root.left = root.right;
        root.right = tem;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
