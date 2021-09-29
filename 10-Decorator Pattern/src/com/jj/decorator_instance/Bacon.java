package com.jj.decorator_instance;

/**
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public class Bacon extends Decorator {
    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    @Override
    public int cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
