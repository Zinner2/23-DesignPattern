package com.jj.synchronouslock;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class SynchronousLockTest {

    public static void main(String[] args) {
        /*
            singleton2=1111541821
            singleton1=1111541821
         */
        new Thread( () ->{
            Singleton singleton1 = Singleton.getSingleton();
            System.out.println("singleton1="+singleton1.hashCode());
        }).start();
        new Thread( () ->{
            Singleton singleton2 = Singleton.getSingleton();
            System.out.println("singleton2="+singleton2.hashCode());
        }).start();
    }
}
