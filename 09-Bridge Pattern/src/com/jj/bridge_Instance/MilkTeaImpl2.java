package com.jj.bridge_Instance;

/**
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public class MilkTeaImpl2 extends MilkTea {

    public MilkTeaImpl2(AddMaterial addMaterial) {
        super(addMaterial);
    }

    @Override
    public void orderMilkTea(int count) {
        System.out.println("您"+count+"元的奶茶好了!");
    }

    @Override
    public void addMater(int count) {
        addMaterial.addMaterial();
    }
}
