package com.jj.simplefactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class SimpleComputerFactory {

    public static final String DELL_FACTORY_NAME = "DELL";

    public Computer orderComputer(String type){
        Computer computer = null;

        if (DELL_FACTORY_NAME.equals(type)){
            computer  = new DellComputer();
        }else {
            System.out.println("没有您想要的电脑");
        }
        computer.createComputer();
        return computer;
    }
}
