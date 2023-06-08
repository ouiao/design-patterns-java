package com.zhou.strategy;

/**
 * @author Zhouzh
 * @since 2023/6/2 14:13
 **/
public class Payment {

    private PaymentStrategy paymentStrategy;


    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void changePayment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void goToPayment() {
        paymentStrategy.pay();
    }
}
