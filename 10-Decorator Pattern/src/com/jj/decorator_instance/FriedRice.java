package com.jj.decorator_instance;

/**
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(5, "炒饭");
    }

    @Override
    public int cost() {
        return getPrice();
    }
}
