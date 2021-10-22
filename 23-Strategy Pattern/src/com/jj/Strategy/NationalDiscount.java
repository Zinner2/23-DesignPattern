package com.jj.Strategy;

/**
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public class NationalDiscount implements Discount {
    @Override
    public void show() {
        System.out.println("欢度国庆,满200-199");
    }
}
