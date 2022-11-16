package com.xaut.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String s = new String("1abc_cbacd");
        Method1 res1 = new Method1();
        String ans1 = res1.solution(s);
        System.out.println(ans1);

        Method2 res2 = new Method2();
        String ans2 = res2.solution(s);
        System.out.println(ans2);
    }
}

