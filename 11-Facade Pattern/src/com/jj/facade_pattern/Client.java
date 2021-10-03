package com.jj.facade_pattern;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 张俊杰
 * @date 2021/10/3  - {TIME}
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS
        ,new LinkedBlockingDeque<>(10));
        Runnable r = new Runnable() {
            @Override
            public void run() {
                facade.say(Thread.currentThread().getName()+"打开全部");
                System.out.println("=================================================");
                facade.say(Thread.currentThread().getName()+"关闭全部");
                System.out.println("=================================================");
                facade.say(Thread.currentThread().getName()+"微信扫一扫");
                System.out.println("=================================================");
            }
        };
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.submit(r);
        }
        threadPoolExecutor.shutdown();
    }
}
