package com.zhou.e2_strategy.demo2_strategy;

/**
 * @author Zhouzh
 * @since 2023/6/9 22:33
 **/
public class App {
    public static void main(String[] args) {
        Context context;

        //由于实例化不同的策略，所以最终在调用context.contextInterface()时，
        //所获得的结果就不尽相同
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
