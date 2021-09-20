package com.jj.hungryman;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class HungryManTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        /*
            singleton1 = 1360875712
            singleton2 = 1360875712
        */
        System.out.println("singleton1 = " + singleton1.hashCode());
        System.out.println("singleton2 = " + singleton2.hashCode());
    }
}
