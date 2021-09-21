package com.jj.simplefactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class ComputerStore {

    public Computer orderComputer(String type){
        SimpleComputerFactory factory = new SimpleComputerFactory();
        Computer computer = factory.orderComputer(type);
        return computer;
    }
}
