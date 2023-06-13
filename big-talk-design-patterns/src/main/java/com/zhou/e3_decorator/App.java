package com.zhou.e3_decorator;


/**
 * @author zhouzh
 * @since 2023/6/13 9:37
 */
public class App {
    public static void main(String[] args) {
        var concreteComponent = new ConcreteComponent();
        var concreteDecoratorA = new ConcreteDecoratorA();
        var concreteDecoratorB = new ConcreteDecoratorB();
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.operation();
    }
}
