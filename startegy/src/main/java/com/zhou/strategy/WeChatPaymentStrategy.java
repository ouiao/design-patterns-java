package com.zhou.strategy;

/**
 * 微信支付实现
 *
 * @author Zhouzh
 * @since 2023/6/2 14:09
 **/
public class WeChatPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("微信付款");
    }
}
