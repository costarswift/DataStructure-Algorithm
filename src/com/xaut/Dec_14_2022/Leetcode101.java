package com.xaut.Dec_14_2022;

import com.xaut.Library.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
    }

    public boolean isSymmetric(TreeNode root) {
        return deepCheck(root.left, root.right);
    }
    boolean deepCheck(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null || left.val != right.val) {
            return false;
        }
        return deepCheck(left.left, right.right) && deepCheck(left.right, right.left);
    }

    public boolean isSymmetricWithQueue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode u = root.left;
        TreeNode v = root.right;
        if(root == null || (u == null && v == null)) {
            return true;
        }
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            if ((u == null || v == null) || (u.val != v.val)) {
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }
}
