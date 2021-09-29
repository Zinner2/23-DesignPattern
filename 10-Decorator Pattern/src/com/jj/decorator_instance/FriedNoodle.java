package com.jj.decorator_instance;

/**
 * 炒面
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public class FriedNoodle extends FastFood {

    public FriedNoodle() {
        super(8, "炒面");
    }

    @Override
    public int cost() {
        return getPrice();
    }
}
