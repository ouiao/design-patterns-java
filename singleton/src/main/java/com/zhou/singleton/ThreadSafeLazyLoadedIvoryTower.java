package com.zhou.singleton;

/**
 * 线程安全懒加载的单例类
 *
 * @Author Zhouzh
 * @Date 2023/3/5 14:18
 **/
public final class ThreadSafeLazyLoadedIvoryTower {
    private static ThreadSafeLazyLoadedIvoryTower INSTANCE;

    private ThreadSafeLazyLoadedIvoryTower() {
        //防止通过反射
        if (INSTANCE != null) {
            throw new IllegalArgumentException("已经初始化");
        }
    }

    /**
     * 直到第一次调用此方法才会实例化
     * @return
     */
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ThreadSafeLazyLoadedIvoryTower();
        }
        return INSTANCE;
    }

}
