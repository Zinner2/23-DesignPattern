package com.jj.template;

/**
 * 蜂蜜苹果
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public class HoneyAppleDrink extends MakeDrinks {
    @Override
    public void selectType() {
        System.out.println(" 加入蜂蜜 ");
    }

    @Override
    public void addFruit() {
        System.out.println(" 添加苹果 ");
    }
}
