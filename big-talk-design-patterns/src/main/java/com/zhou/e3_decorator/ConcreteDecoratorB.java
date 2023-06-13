package com.zhou.e3_decorator;

/**
 * 具体装饰对象B
 *
 * @author zhouzh
 * @since 2023/6/13 9:41
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();//首先运行原有Component得operation()
        this.addedBehavior();//在执行本类独有功能
    }

    //本类独有方法，以区别ConcreteDecoratorA类
    private void addedBehavior() {
        System.out.println("具体装饰对象B得独有操作");
    }
}
