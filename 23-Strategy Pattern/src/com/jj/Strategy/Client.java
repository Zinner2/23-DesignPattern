package com.jj.Strategy;

/**
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public class Client {
    public static void main(String[] args) {

        SalesMan salesMan = new SalesMan();
        salesMan.setDiscount(new DoubleElevenDiscount());
        salesMan.showDiscount();

        salesMan.setDiscount(new NationalDiscount());
        salesMan.showDiscount();

        salesMan.setDiscount(new SpringDiscount());
        salesMan.showDiscount();
    }
}
