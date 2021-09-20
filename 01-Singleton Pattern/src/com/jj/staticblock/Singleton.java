package com.jj.staticblock;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class Singleton {

    private static final Singleton INSTANCE;

    /**
     * 构造方法私有化
     */
    private Singleton(){}

    /**
     *  静态代码块只执行一次
     */
    static {
        INSTANCE = new Singleton();
    }

    /**
     * 提供公共方法,让外界获取该对象
     * @return
     */
    public static Singleton getSingleton(){
        return INSTANCE;
    }
}
