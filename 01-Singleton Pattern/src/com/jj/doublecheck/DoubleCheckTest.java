package com.jj.doublecheck;

import com.jj.lazyman.Singleton;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class DoubleCheckTest {
    public static void main(String[] args) {
        com.jj.doublecheck.Singleton singleton1 = com.jj.doublecheck.Singleton.getSingleton();
        com.jj.doublecheck.Singleton singleton2 = com.jj.doublecheck.Singleton.getSingleton();
        /*
            singleton1 = 460141958
            singleton2 = 460141958
        */
        System.out.println("singleton1 = " + singleton1.hashCode());
        System.out.println("singleton2 = " + singleton2.hashCode());


        System.out.println("============================多线程模式下============================");

        new Thread( () ->{
            com.jj.doublecheck.Singleton singleton3 = com.jj.doublecheck.Singleton.getSingleton();
            System.out.println("singleton3="+singleton3.hashCode());
        }).start();
        new Thread( () ->{
            com.jj.doublecheck.Singleton singleton4 = com.jj.doublecheck.Singleton.getSingleton();
            System.out.println("singleton4="+singleton4.hashCode());
        }).start();
    }
}
