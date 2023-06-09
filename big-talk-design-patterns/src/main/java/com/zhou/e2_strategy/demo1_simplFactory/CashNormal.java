package com.zhou.e2_strategy.demo1_simplFactory;

/**
 * 正常收费
 *
 * @author Zhouzh
 * @since 2023/6/9 21:53
 **/
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
