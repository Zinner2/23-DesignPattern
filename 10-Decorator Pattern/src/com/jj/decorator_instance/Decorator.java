package com.jj.decorator_instance;

/**
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public abstract class Decorator extends FastFood {

    private FastFood fastFood;

    public Decorator(int price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

}
