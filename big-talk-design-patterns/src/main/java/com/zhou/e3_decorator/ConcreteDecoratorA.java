package com.zhou.e3_decorator;

/**
 * 具体装饰对象A
 *
 * @author zhouzh
 * @since 2023/6/13 9:38
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;//本类独有字段，以区别ConcreteDecoratorB类
    @Override
    public void operation() {
        super.operation();//首先运行原有Component得operation()
        this.addedState = "具体装饰对象A得独有操作";//在执行本类独有功能
        System.out.println(this.addedState);
    }
}
