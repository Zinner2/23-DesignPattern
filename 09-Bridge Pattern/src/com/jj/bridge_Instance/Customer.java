package com.jj.bridge_Instance;

/**
 *
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public class Customer {
    public static void main(String[] args) {

        MilkTea milkTea = new MilkTeaImpl1(new Coconut());
        milkTea.addMater(10);
        milkTea.orderMilkTea(15);

        MilkTea milkTea1 = new MilkTeaImpl2(new Pearl());
        milkTea1.addMater(5);
        milkTea1.orderMilkTea(10);
    }
}
