package com.xaut.IntToRomanNum.Method;

public class method {
    StringBuilder res = new StringBuilder();
    public String intToRoman(int num) {

        int m = num / 1000;
        if (m > 0){
            for (int i = 0; i < m; i++){
                res.append("M");
            }
        }

        int d = num % 1000 / 100;
        process(d, "C", "D", "M");

        int x = num % 100 / 10;
        process(x, "X", "L", "C");

        int i = num % 10;
        process(i, "I", "V", "X");

        return res.toString();
    }

    //处理数据方法
    private void process(int n, String a, String b, String c){
        if (n < 4){
            for(int i = 0;i < n; i++) {
                res.append(a);
            }
        }
        if (n == 4) res.append(a + b);
        if (4 < n && n < 9){
            res.append(b);
            while (n - 5 > 0){
                res.append(a);
                n--;
            }
        }
        if (n == 9) res.append(a + c);
    }
}
