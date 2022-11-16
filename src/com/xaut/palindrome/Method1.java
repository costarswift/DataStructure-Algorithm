package com.xaut.palindrome;

public class Method1 {
    public String solution(String s){
        if (s.length() < 2) return s;
        Boolean[][] pd = new Boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            pd[i][i] = true;
        }

        //将字符串转换为字符数组
        char[] ch = s.toCharArray();

        int begin = 0;
        int maxLen = 1;

        for (int L = 2; L <= s.length(); L++) {
            for (int left = 0; left < s.length(); left++) {
                int right = left + L -1;
                if (right >= s.length()) break;

                if (ch[left] != ch[right]){
                    pd[left][right] = false;
                }else{
                    if (L == 2 || L == 3){
                        pd[left][right] = true;
                    }else{
                        pd[left][right] = pd[left + 1][right - 1];
                    }


                }

                if (pd[left][right] && L > maxLen) {
                    begin = left;
                    maxLen = L;
                }
            }
        }

        return s.substring(begin,begin + maxLen);
    }
}
