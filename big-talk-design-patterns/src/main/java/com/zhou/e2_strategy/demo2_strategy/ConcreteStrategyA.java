package com.zhou.e2_strategy.demo2_strategy;

/**
 * 具体算法A
 *
 * @author Zhouzh
 * @since 2023/6/9 22:30
 **/
public class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}
