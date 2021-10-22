package com.jj.template;

/**
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public abstract class MakeDrinks {

    public final void make(){

        selectType();
        addMilk();
        pouring();
        addFruit();
    }

    /**
     * 选择种类
     */
    public abstract void selectType();

    public  void addMilk(){
        System.out.println("第二部 --> 加入牛奶");
    }

    public void pouring(){
        System.out.println("第三步 --> 导入杯中");
    }

    /**
     * 添加水果
     */
    public abstract void addFruit();


}
