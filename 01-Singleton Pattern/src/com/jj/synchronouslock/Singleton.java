package com.jj.synchronouslock;

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
     * 定义本类常量
     */
    private static Singleton INSTANCE;

    /**
     * 提供公共方法,让外界获取该对象
     * @return
     */
    public static synchronized Singleton getSingleton() {
        if (INSTANCE == null){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
