package com.xaut.MyAtoi;

public class myAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("    0-256987adf"));
        System.out.println(myAtoi("    -256987adf"));
        System.out.println(myAtoi("    2569878888888888888adf"));
        System.out.println(myAtoi("    -2569878888888888888adf"));
        System.out.println(myAtoi("    "));
    }

    public static int myAtoi(String s){

        String str = s.trim();
        if (str.length() == 0) return 0;

        if (!Character.isDigit(str.charAt(0))
                && str.charAt(0) != '-' && str.charAt(0) != '+')
            return 0;
        long ans = 0L;
        boolean neg = str.charAt(0) == '-';//判断第一位是否是“-”。

        int i = !Character.isDigit(str.charAt(0)) ? 1 : 0;
        //第一位是数字从第一位开始；第一位是符号，从下一位开始。

        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            ans = ans * 10 + (str.charAt(i++) - '0');//
            if (!neg && ans > Integer.MAX_VALUE) {
                ans = Integer.MAX_VALUE;
                break;
            }
            if (neg && ans > 1L + Integer.MAX_VALUE) {
                ans = 1L + Integer.MAX_VALUE;
                break;
            }
        }
        return neg ? (int) -ans : (int) ans;
    }
}
