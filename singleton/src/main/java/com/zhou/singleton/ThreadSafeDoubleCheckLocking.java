package com.zhou.singleton;

/**
 * 线程安全的双重检查锁单例
 *
 * @Author Zhouzh
 * @Date 2023/3/5 16:10
 **/
public final class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking INSTANCE;

    public ThreadSafeDoubleCheckLocking() {
        if (INSTANCE != null) {
            throw new IllegalArgumentException("已经初始化");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance() {
        //局部变量使性能提高25% Joshua Bloch《Effective Java，第二版》，第283-284页
        var result = INSTANCE;
        //检查实例是否已被初始化
        //如初始化则返回
        if (result == null) {
            //可能没有初始化，在并发情况下保证互斥
            synchronized (ThreadSafeDoubleCheckLocking.class) {
                //再次将实例分配给局部变量，以检查当前线程被阻塞进入锁定区域时，该实例是否已被其他线程初始化。
                //如意初始化则直接返回
                result = INSTANCE;
                if (result == null) {
                    //实例仍然没有初始化，所以我们可以安全地(没有其他线程可以进入这个区域)
                    //创建一个实例，并成为单例实例。
                    INSTANCE = result = new ThreadSafeDoubleCheckLocking();
                }
            }
        }

        return result;
    }
}
