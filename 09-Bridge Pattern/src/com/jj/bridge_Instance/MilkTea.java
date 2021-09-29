package com.jj.bridge_Instance;

/**
 * 奶茶接口
 * @author 张俊杰
 * @date 2021/9/29  - {TIME}
 */
public abstract class MilkTea {
    protected AddMaterial addMaterial;

    public MilkTea(AddMaterial addMaterial) {
        this.addMaterial = addMaterial;
    }

    /**
     * 点奶茶
     * @param count
     */
    public abstract void orderMilkTea(int count);


    /**
     * 加料
     * @param count
     */
    public abstract void addMater(int count);
}
