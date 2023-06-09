package com.zhou.e2_strategy.demo2_strategy;

/**
 * @author Zhouzh
 * @since 2023/6/9 22:32
 **/
public class Context {
    Strategy strategy;
    //初始化时，传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //上下文接口
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
