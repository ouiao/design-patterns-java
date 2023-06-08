package com.zhou.e1_simpleFactory;

/**
 * 加法类
 * @author zhouzh
 * @since 2023/6/8 8:32
 */
public class Add implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
