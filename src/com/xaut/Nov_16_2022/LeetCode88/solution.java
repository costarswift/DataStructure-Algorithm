package com.xaut.Nov_16_2022.LeetCode88;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] nums1 = {0,2,4,6,8,0,0,0,0,0};
        int[] nums2 = {1,3,5,7,9};

        merge(nums1, 5, nums2, 5);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tem = new int[m + n];

        int nums1_node = 0;
        int nums2_node = 0;
        int i = 0;
        while ((nums1_node < m || nums2_node < n) && i < m + n) {
            if (nums1_node >= m) {
                tem[i++] = nums2[nums2_node++];
            }else if (nums2_node >= n) {
                tem[i++] = nums1[nums1_node++];
            }else {
                if(nums1[nums1_node] <= nums2[nums2_node]){
                    tem[i++] = nums1[nums1_node++];
                }else{
                    tem[i++] = nums2[nums2_node++];
                }
            }
        }
        System.arraycopy(tem, 0, nums1, 0, tem.length);
    }
}
