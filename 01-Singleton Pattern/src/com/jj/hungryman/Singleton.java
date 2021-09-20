package com.jj.hungryman;

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
     * 创建本类对象
     */
    private static final Singleton INSTANCE = new Singleton();

    /**
     * 提供公共方法,让外界获取该对象
     * @return
     */
    public static Singleton getSingleton(){
        return INSTANCE;
    }
}
