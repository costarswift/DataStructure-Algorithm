package com.xaut.Dec_17_2022;

public class Leetcode415 {
    public static void main(String[] args) {
        System.out.println(addStrings("1234", "5678"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int z = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while(i >= 0 || j >= 0 || z == 1){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            ans.append((x + y + z) % 10);
            z = (x + y + z) / 10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}
