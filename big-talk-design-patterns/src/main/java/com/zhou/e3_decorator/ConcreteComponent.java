package com.zhou.e3_decorator;

/**
 * 具体对象
 *
 * @author zhouzh
 * @since 2023/6/12 13:05
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体实现对象的操作");
    }
}
