package com.xaut.Jan_03_2024;

import java.math.BigDecimal;

/**
 * @Author Costar Swift
 * @Date 2024-01-03 下午 8:59
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        float a = 57.3f;
        BigDecimal decimalA = new BigDecimal(a);
        System.out.println(decimalA);

        double b = 57.3;

        BigDecimal decimalB = new BigDecimal(b);
        System.out.println(decimalB);

        double c = 57.3;
        BigDecimal decimalC = new BigDecimal(Double.toString(c));
        System.out.println(decimalC);

        double d = 57.3;
        BigDecimal decimalD = BigDecimal.valueOf(d);
        System.out.println(decimalD);

        BigDecimal add = decimalC.add(decimalD);
        System.out.println(add);

        BigDecimal subtract = decimalC.subtract(decimalD);
        System.out.println(subtract);
        System.out.println(subtract.doubleValue());
    }
}
