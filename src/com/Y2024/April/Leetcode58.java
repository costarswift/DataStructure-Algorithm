package com.Y2024.April;

/**
 * @Author Costar
 * @Date 周四 2024/4/4 0:12
 */
public class Leetcode58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" hello world i am Java "));
    }

    private static int lengthOfLastWord(String s) {
        String str = s.trim();
        return str.length() - 1 - str.lastIndexOf(" ");
    }
}
