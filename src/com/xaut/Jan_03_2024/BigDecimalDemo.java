package com.xaut.Jan_03_2024;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author Costar Swift
 * @Date 2024-01-03 下午 8:59
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);
        System.out.println(tool("0.1", "0.2", 0.001D));
        System.out.println(tool("0.1", "0.2", null));
        System.out.println(tool("0.11", "0.21", 0.011));
    }

    private static Double tool(String var1, String var2, Double var3) {
        BigDecimal totalNetAmount = new BigDecimal(var1);
        if (var3 != null) {
            totalNetAmount = totalNetAmount.add(new BigDecimal(var2)).subtract(BigDecimal.valueOf(var3));
        } else {
            totalNetAmount = totalNetAmount.add(new BigDecimal(var2));
        }
        return totalNetAmount.setScale(6, RoundingMode.UP).doubleValue();
    }
}
