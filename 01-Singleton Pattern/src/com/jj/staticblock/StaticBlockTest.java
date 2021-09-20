package com.jj.staticblock;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class StaticBlockTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        /*
            singleton1 = 460141958
            singleton2 = 460141958
        */
        System.out.println("singleton1 = " + singleton1.hashCode());
        System.out.println("singleton2 = " + singleton2.hashCode());
    }
}
