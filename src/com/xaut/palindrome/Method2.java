package com.xaut.palindrome;

public class Method2 {
    public String solution (String s){
        if (s.length() < 2) return s;

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int maxLength = Math.max(centerExtends(s,i,i),centerExtends(s,i,i + 1));
            if (maxLength > end - start){
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return s.substring(start,end + 1);

    }

    private int centerExtends(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
