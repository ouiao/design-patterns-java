package com.zhou.e2_strategy.demo1_simplFactory;

/**
 * @author Zhouzh
 * @since 2023/6/9 22:02
 **/
public class CashFactory {
    public static CashSuper createCashAccept(int cashType) {
        return switch (cashType){
            case 1 -> new CashNormal();//正常收费
            case 2 -> new CashRebate(0.8d);//打八折
            case 3 -> new CashRebate(0.7d);//打七折
            case 4 -> new CashReturn(300d,100d);//满300返100
            default -> null;
        };
    }
}
