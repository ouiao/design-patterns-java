package com.zhou.e2_strategy.demo1_simplFactory;

/**
 * 打折收费
 *
 * @author Zhouzh
 * @since 2023/6/9 21:54
 **/
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        return price * num * this.moneyRebate;
    }
}
