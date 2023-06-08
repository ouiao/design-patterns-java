package com.zhou.e1_simpleFactory;

/**
 * 平方
 *
 * @author zhouzh
 * @since 2023/6/8 9:09
 */
public class Pow implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return Math.pow(numberA, numberB);
    }
}
