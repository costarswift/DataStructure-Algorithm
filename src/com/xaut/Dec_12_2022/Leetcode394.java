package com.xaut.Dec_12_2022;

import java.util.Stack;


public class Leetcode394 {
    public static void main(String[] args) {
        System.out.println(decodeString("3[ab]2[cd]ef"));
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
    }

    public static String decodeString(String s) {
        StringBuffer ans = new StringBuffer();
        Stack<Integer> multiStack = new Stack<>();
        Stack<StringBuffer> ansStack = new Stack<>();
        int multi = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) {
                multi = multi * 10 + (c - '0');
            }else if(c == '['){
                ansStack.add(ans);
                multiStack.add(multi);

                ans = new StringBuffer();
                multi = 0;
            }else if(Character.isAlphabetic(c)){
                ans.append(c);
            }else{
                StringBuffer string = ans;
                ans = ansStack.pop();
                int tmp = multiStack.pop();
                while(tmp-- > 0){
                    ans.append(string);
                }
            }
        }
        return ans.toString();
    }
}
