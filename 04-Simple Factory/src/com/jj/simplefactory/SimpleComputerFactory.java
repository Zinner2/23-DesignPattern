package com.jj.simplefactory;

import java.time.Year;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class SimpleComputerFactory {

    public static final String DELL_FACTORY_NAME = "DELL";
    public static final String REDMI_FACTORY_NAME = "REDMI";

    public Computer orderComputer(String type){
        Computer computer = null;

        if (DELL_FACTORY_NAME.equals(type)){
            computer  = new DellComputer();
        }else if (REDMI_FACTORY_NAME.equals(type)){
            computer = new RedMiComputer();
        }
        else {
            System.out.println("没有您想要的电脑");
        }
        computer.createComputer();
        return computer;
    }
}
