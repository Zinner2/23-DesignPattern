package com.jj.flyweight_pattern;

/**
 * @author 张俊杰
 * @date 2021/10/3  - {TIME}
 */
public abstract class Level {

    String class1;
    int price;

    @Override
    public String toString() {
        return "Level{" +
                "class1='" + class1 + '\'' +
                ", price=" + price +
                '}';
    }
}
