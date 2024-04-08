//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
//
//
//
//
//
// 示例 1:
//
//
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//
//
// 示例 2:
//
//
//输入: numRows = 1
//输出: [[1]]
//
//
//
//
// 提示:
//
//
// 1 <= numRows <= 30
//
//
// Related Topics 数组 动态规划 👍 1144 👎 0

package com.Y2024.April;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Costar
 * @Date 周一 2024/4/8 23:36
 */
public class Leetcode118 {
    public static void main(String[] args) {
        List<List<Integer>> lists = generate(5);
        System.out.println(lists);
    }
    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            final List<List<Integer>> res = new ArrayList<>(numRows);
            res.add(Collections.singletonList(1));
            return res;
        }

        List<List<Integer>> res = generate(numRows - 1);
        List<Integer> preRes = res.get(numRows - 2);
        List<Integer> list = new ArrayList<>(numRows);

        list.add(1);
        for (int i = 0; i < numRows - 2; i++) {
            int tem = preRes.get(i) + preRes.get(i + 1);
            list.add(tem);
        }
        list.add(1);

        res.add(list);
        return res;
    }
}
