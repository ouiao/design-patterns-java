package com.zhou.singleton;

/**
 * 单例类。主动初始化静态实例保证线程安全。
 *
 * @Author Zhouzh
 * @Date 2023/3/5 14:02
 **/
public final class IvoryTower {

    /**
     * 私有构造函数，所以不能实例此类
     */
    private IvoryTower() {
    }

    /**
     * 静态属性在类加载时实例化
     */
    private static final IvoryTower INSTANCE = new IvoryTower();

    /**
     * 对外公开方法，获取实例对象
     * @return 单例的实例对象
     */
    public static IvoryTower getInstance(){
        return INSTANCE;
    }
}
