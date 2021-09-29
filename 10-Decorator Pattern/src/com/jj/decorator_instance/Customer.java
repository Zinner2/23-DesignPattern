package com.jj.decorator_instance;

/**
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public class Customer {
    public static void main(String[] args) {

        // 培根鸡蛋炒饭  8元
        System.out.println(new Bacon(new Egg(new FriedRice())).getDesc() + "  " + new Bacon(new Egg(new FriedRice())).cost() + "元");

    }
}
