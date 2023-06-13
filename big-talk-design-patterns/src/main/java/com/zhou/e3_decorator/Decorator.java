package com.zhou.e3_decorator;

/**
 * 装饰抽象类
 *
 * @author zhouzh
 * @since 2023/6/12 13:06
 */
public abstract class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
