package com.jj.Strategy;

/**
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public class SpringDiscount implements Discount {
    @Override
    public void show() {
        System.out.println("春节促销,买一送一");
    }
}
