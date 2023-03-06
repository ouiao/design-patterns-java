package com.zhou.singleton;

import org.junit.Test;

import java.util.Objects;

/**
 * TODO
 *
 * @Author Zhouzh
 * @Date 2023/3/5 14:11
 **/
public class AppTest {

    @Test
    public void testIvoryTower(){
        IvoryTower i1 = IvoryTower.getInstance();
        IvoryTower i2 = IvoryTower.getInstance();
        System.out.println(Objects.equals(i1, i2));
    }
    @Test
    public void testThreadSafeLazyLoadedIvoryTower(){
        ThreadSafeLazyLoadedIvoryTower i1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower i2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        System.out.println(i1 == i2);
    }

    @Test
    public void testInitializingOnDemandHolderClassIdiom(){
        InitializingOnDemandHolderClassIdiom i1 = new InitializingOnDemandHolderClassIdiom();
        System.out.println(i1);
    }

    @Test
    public void testThreadSafeDoubleCheckLocking(){
        ThreadSafeDoubleCheckLocking i1 = ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking i2 = ThreadSafeDoubleCheckLocking.getInstance();

        System.out.println(i1 == i2);
    }

    @Test
    public void testEnumIvoryTower(){
        EnumIvoryTower i1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower i2 = EnumIvoryTower.INSTANCE;
        System.out.println(i1);
        System.out.println(i2);
    }

}
