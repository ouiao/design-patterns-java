package com.zhou.e2_strategy.demo2_strategy;

/**
 * 具体算法B
 *
 * @author Zhouzh
 * @since 2023/6/9 22:31
 **/
public class ConcreteStrategyB extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法B实现");
    }
}
