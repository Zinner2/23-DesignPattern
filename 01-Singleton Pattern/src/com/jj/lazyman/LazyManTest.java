package com.jj.lazyman;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class LazyManTest {
    public static void main(String[] args) {
        /*
            在多线程模式下，同时两个线程进入 if (INSTANCE == null)
            就不是单例了。
       */
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        /*
            singleton1 = 460141958
            singleton2 = 460141958
        */
        System.out.println("singleton1 = " + singleton1.hashCode());
        System.out.println("singleton2 = " + singleton2.hashCode());


        System.out.println("============================多线程模式下============================");

        new Thread( () ->{
            Singleton singleton3 = Singleton.getSingleton();
            System.out.println("singleton3="+singleton3.hashCode());
        }).start();
        new Thread( () ->{
            Singleton singleton4 = Singleton.getSingleton();
            System.out.println("singleton4="+singleton4.hashCode());
        }).start();
    }
}
