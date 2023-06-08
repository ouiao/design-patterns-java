package com.zhou.e1_simpleFactory;

/**
 * 除法类
 * @author zhouzh
 * @since 2023/6/8 8:33
 */
public class Divide implements Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        if (numberB == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return numberA / numberB;
    }
}
