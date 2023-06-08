package com.zhou.strategy;

/**
 * apple pay
 *
 * @author Zhouzh
 * @since 2023/6/2 14:12
 **/
public class ApplePayPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("apple pay付款");
    }
}
