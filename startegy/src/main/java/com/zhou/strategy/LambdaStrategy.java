package com.zhou.strategy;

/**
 * @author Zhouzh
 * @since 2023/6/2 14:16
 **/
public class LambdaStrategy {

    public enum Strategy implements PaymentStrategy{
        WeCahtPayStrategy(() -> System.out.println("微信支付")),
        AliPayStrategy(() -> System.out.println("支付宝支付")),
        ApplePayStrategy(() -> System.out.println("apple pay支付")),
        ;

        private final PaymentStrategy paymentStrategy;

        Strategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        @Override
        public void pay() {
            paymentStrategy.pay();
        }
    }
}
