package com.xaut.Zconvert;



public class Zconvert {
    public static void main(String[] args) {
        Solution s = new Solution();
        String res = s.convert("PAYPALISHIRING", 5);
        System.out.println(res);

        System.out.println("-----------------");
        String res2 = s.convert2("PAYPALISHIRING", 5);
        System.out.println(res2);

        System.out.println("-----------------");
        String res3 = s.convert3("PAYPALISHIRING", 5);
        System.out.println(res3);
    }

}

class Solution{
    public String convert(String s, int numRows) {
        if (s.length() <= numRows  || numRows == 1) return s;

        //将字符串S转换为字符数组
        char[] chars = s.toCharArray();
        int len = chars.length;
        int t = 2 * numRows - 2;
        int c = (len + t - 1) / t * (numRows -1);

        char[][] N = new char[numRows][c];
        for (int i = 0, x = 0, y = 0; i < len; ++i) {
            N[x][y] = s.charAt(i);
            if (i % t < numRows - 1) {
                ++x; // 向下移动
            } else {
                --x;
                ++y; // 向右上移动
            }
        }

        StringBuffer ans = new StringBuffer();
        for (char[] row : N) {
            for (char ch : row) {
                if (ch != 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }

    public String convert2(String s, int numRows) {
        int n = s.length(), r = numRows;
        if (r == 1 || r >= n) {
            return s;
        }
        StringBuffer[] mat = new StringBuffer[r];
        for (int i = 0; i < r; ++i) {
            mat[i] = new StringBuffer();
        }
        int x = 0;
        int t = r * 2 - 2;
        for (int i = 0; i < n; ++i) {
            mat[x].append(s.charAt(i));
            if (i % t < r - 1) {
                ++x;
            } else {
                --x;
            }
        }
        StringBuffer ans = new StringBuffer();
        for (StringBuffer row : mat) {
            ans.append(row);
        }

        return ans.toString();
    }

    public String convert3(String s, int numRows) {
        int r = numRows;
        if (r == 1 || r >= s.length()) return s;

        int t = 2 * r - 2;//t是每个周期的元素数量

        StringBuilder res = new StringBuilder();

        for (int j = 0; j < r; j++) {
            for (int i = 0; i <s.length(); i++) {
                if (i % t == j || i % t == (t - j)) res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}