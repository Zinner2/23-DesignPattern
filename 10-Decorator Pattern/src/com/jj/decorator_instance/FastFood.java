package com.jj.decorator_instance;

/**
 * 快餐类
 *
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public abstract class FastFood {

    private int price;

    private String desc;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood() {
    }

    public FastFood(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    /**
     * 价格
     * @return
     */
    public abstract int cost();
}
