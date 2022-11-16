package com.xaut.maxSkyline;

import java.util.Arrays;

public class maxSkyline {
    public static void main(String[] args) {
        int[][] city = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(city));

    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        //求出每行、每列的最大值放入数组
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i],grid[i][j]);
                colMax[j] = Math.max(colMax[j],grid[i][j]);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                ans += Math.min(rowMax[i],colMax[j]) - grid[i][j];
            }
        }
        return ans;
    }


}
