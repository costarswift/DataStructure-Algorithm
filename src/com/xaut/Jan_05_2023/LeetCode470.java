package com.xaut.Jan_05_2023;

import java.util.Random;

public class LeetCode470 {
    public static void main(String[] args) {
        int i = 1000;
        while(i-- > 0){
            int res = rand10();
            System.out.println(res >= 1 && res <= 10);
        }
    }

    public static int rand10() {
        int first, second;
        while ((first = rand7()) > 6);
        while ((second = rand7()) > 5);
        return (first & 1) == 1 ? second : 5 + second;
    }

    public static int rand10_1() {
        int idx;
        do {
            idx = rand7() + (rand7() - 1) * 7;
        } while (idx > 40);
        return idx % 10 + 1;
    }

    private static int rand7() {
        return new Random().nextInt(1,8);
    }


}
