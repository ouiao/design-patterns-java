package com.zhou.singleton;

/**
 * 私有内部类单例
 *
 * @Author Zhouzh
 * @Date 2023/3/5 14:35
 **/
public final class InitializingOnDemandHolderClassIdiom {

    public InitializingOnDemandHolderClassIdiom() {
    }

    /**
     * 调用静态内部类属性
     * @return
     */
    public static InitializingOnDemandHolderClassIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }

    /**
     * 静态内部类不被调用则类不会被加载
     */
    private static class HelperHolder {
        private static final InitializingOnDemandHolderClassIdiom INSTANCE = new InitializingOnDemandHolderClassIdiom();
    }
}
