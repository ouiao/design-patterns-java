package com.zhou.e2_strategy.demo3_strategyAndSimpleFactory;

import com.zhou.e2_strategy.demo1_simplFactory.CashNormal;
import com.zhou.e2_strategy.demo1_simplFactory.CashRebate;
import com.zhou.e2_strategy.demo1_simplFactory.CashReturn;
import com.zhou.e2_strategy.demo1_simplFactory.CashSuper;

/**
 * @author Zhouzh
 * @since 2023/6/9 22:35
 **/
public class CashContext {
    private CashSuper cash;

    public CashContext(int cashType) {
        getCashByType(cashType);
    }

    public void setCs(CashSuper cs) {
        this.cash = cs;
    }

    private void getCashByType(int cashType) {
        switch (cashType) {
            case 1 -> this.setCs(new CashNormal());
            case 2 -> this.setCs(new CashRebate(0.8d));
            case 3 -> this.setCs(new CashRebate(0.7d));
            case 4 -> this.setCs(new CashReturn(300, 100));
        }
    }

    public double getResult(double price, int num) {
        //根据收费策略不同，获得计算结果
        return this.cash.acceptCash(price, num);
    }
}
