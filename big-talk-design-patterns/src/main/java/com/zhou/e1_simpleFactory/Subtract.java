package com.zhou.e1_simpleFactory;

/**
 * 减法类
 *
 * @author zhouzh
 * @since 2023/6/8 8:33
 */
public class Subtract implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
