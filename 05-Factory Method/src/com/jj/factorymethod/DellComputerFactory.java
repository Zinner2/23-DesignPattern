package com.jj.factorymethod;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class DellComputerFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        DellComputer dellComputer = new DellComputer();
        dellComputer.buildCpu();
        dellComputer.buildDarkDisk();
        dellComputer.buildGraphicsCard();
        dellComputer.buildMemory();
        dellComputer.buildMainBord();
        return dellComputer;
    }

}
