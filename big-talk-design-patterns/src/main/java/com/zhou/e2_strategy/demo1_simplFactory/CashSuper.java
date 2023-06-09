package com.zhou.e2_strategy.demo1_simplFactory;

/**
 * 收费抽象
 *
 * @author Zhouzh
 * @since 2023/6/9 21:52
 **/
public abstract class CashSuper {
    public abstract double acceptCash(double price, int num);
}
