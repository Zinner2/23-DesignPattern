package com.jj.Strategy;

/**
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public class DoubleElevenDiscount implements Discount {
    @Override
    public void show() {
        System.out.println("双十一来袭,预售赢好礼");
    }
}
