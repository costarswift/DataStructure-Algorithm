package com.xaut.multiply_String;

import java.math.BigDecimal;

public class multiplyString {
    public static void main(String[] args) {
        System.out.println(solution("2566666666666", "2566666666666"));
    }

    private static String solution(String num1, String num2){
        return new BigDecimal(num1).multiply(new BigDecimal(num2)).toString();

    }
}

