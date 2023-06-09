package com.zhou.e2_strategy.demo1_simplFactory;

/**
 * 返利
 *
 * @author Zhouzh
 * @since 2023/6/9 21:57
 **/
public class CashReturn extends CashSuper {

    //返利条件
    private double moneyCondition = 0d;

    //返利值
    private double moneyReturn = 0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        var result = price * num;
        if (this.moneyCondition > 0 && result >= this.moneyCondition) {
            result = result - Math.floor(result / this.moneyCondition) * this.moneyReturn;
        }
        return result;
    }
}
