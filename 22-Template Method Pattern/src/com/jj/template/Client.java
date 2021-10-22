package com.jj.template;

/**
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        MakeDrinks smoothieLemon = new SmoothieLemon();
        smoothieLemon.make();

        System.out.println("================");

        MakeDrinks honeyAppleDrink = new HoneyAppleDrink();
        honeyAppleDrink.make();

    }
}
