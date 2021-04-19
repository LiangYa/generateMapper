package com.code.rule;


import java.math.BigDecimal;

/**
 * @author liangya
 * @date 2021/4/19 11:49
 */
public class BigDecimalRule {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("0.10");
        BigDecimal decimal1 = BigDecimal.valueOf(0.1);
        BigDecimal decimal2 = new BigDecimal("0.1");
        System.out.println(decimal.equals(decimal1));
        System.out.println(decimal.equals(decimal2));

        System.out.println(decimal.compareTo(decimal1));
        System.out.println(decimal.compareTo(decimal2));
    }
}
