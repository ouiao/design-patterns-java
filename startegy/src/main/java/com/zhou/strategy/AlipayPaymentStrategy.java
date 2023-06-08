package com.zhou.strategy;

/**
 * 支付宝
 * @author Zhouzh
 * @since 2023/6/2 14:10
 **/
public class AlipayPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("支付宝付款");
    }
}
