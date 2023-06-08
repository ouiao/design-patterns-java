package com.zhou;

import com.zhou.strategy.*;

public class App {
    public static void main(String[] args) {
        var payment = new Payment(new AlipayPaymentStrategy());
        payment.goToPayment();
        payment.changePayment(new ApplePayPaymentStrategy());
        payment.goToPayment();
        payment.changePayment(new WeChatPaymentStrategy());
        payment.goToPayment();

        //lambda 方式
        payment.changePayment(LambdaStrategy.Strategy.AliPayStrategy);
        payment.goToPayment();
    }
}