package com.zhou.singleton;

/**
 * 基于Enum的单例实现。
 * 这个实现是线程安全的，但是添加任何其他方法及其线程安全是开发人员的责任
 */
public enum EnumIvoryTower {
    INSTANCE,
    ;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }

}
