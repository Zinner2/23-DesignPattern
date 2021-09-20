package com.jj.innerclass;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class Singleton {


    /**
     * 构造方法私有化
     */
    private Singleton(){}

    /**
     * 静态内部类
     */
    private static class SingletonInner{
        private static final Singleton SINGLETON = new Singleton();
    }

    /**
     * 提供公共方法,让外界获取该对象
     * @return
     */
    public static Singleton getSingleton(){
        return SingletonInner.SINGLETON;
    }
}
