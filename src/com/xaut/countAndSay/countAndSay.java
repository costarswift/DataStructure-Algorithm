package com.xaut.countAndSay;

public class countAndSay {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static String solution(int n){
        String ans = "1";
        for (int j = 2; j <= n; j++) {
            String s = "";
            int count = 1;
            for (int i = 0; i < ans.length(); i++) {
                if (i < ans.length() - 1 && ans.charAt(i + 1) == ans.charAt(i)) {
                    count++;
                    continue;
                }
                s += String.valueOf(count) + ans.charAt(i);
                count = 1;
            }
            ans = s;
        }
        return ans;
    }
}
