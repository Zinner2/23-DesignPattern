package com.jj.template;

/**
 * 冰沙柠檬
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public class SmoothieLemon extends MakeDrinks {
    @Override
    public void selectType() {
        System.out.println(" 加入冰沙 ");
    }

    @Override
    public void addFruit() {
        System.out.println(" 加入柠檬 ");
    }
}
