package com.xaut.LeetCode54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        /*
        1   2  3  4
        5   6  7  8
        9  10 11 12
        13 14 15 16
         */
        List<Integer> res = spiralOrder(matrix);
        System.out.println(res);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] flag = new boolean[m][n];
        List<Integer> res = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (true) {
            if (res.size() == m * n) {
                return res;
            }
            res.add(matrix[i][j]);
            flag[i][j] = true;
            if (j + 1 < n && !flag[i][j+1] && (i == 0 || flag[i-1][j])){
                j++;
            } else if (i + 1 < m && !flag[i+1][j]){
                i++;
            } else if (j > 0 && !flag[i][j-1]) {
                j--;
            } else if (i > 0 && !flag[i-1][j]){
                i--;
            }
        }
    }
}
