package com.xaut.Divide;

public class divide {
    public static void main(String[] args) {
    }

    private static int divide(int dividend, int divisor) {
        if (divisor == 1) return dividend;
        if (divisor == Integer.MIN_VALUE) return dividend == Integer.MIN_VALUE ? 1 : 0;

        if (dividend == 0) return 0;
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) return Integer.MAX_VALUE;
            int j = divide(dividend + Math.abs(divisor), divisor);
            return divisor > 0 ? (j - 1) : (j + 1);
        }

        int dd = Math.abs(dividend);
        int dr = Math.abs(divisor);
        int res = 0;
        while (dd >= dr){
            int i = 1;
            int temp = dr;
            while (dd >= temp){
                dd -= temp;
                res += i;
                i = i + i;
                temp = temp + temp;
                if(temp < 0) break;//整型溢出，直接退出循环
            }
        }
        return (dividend ^ divisor) < 0 ? -res : res;
    }
}
