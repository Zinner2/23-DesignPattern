package com.jj.factorymethod;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class RedMiComputerFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        RedMiComputer redMiComputer = new RedMiComputer();
        redMiComputer.buildCpu();
        redMiComputer.buildDarkDisk();
        redMiComputer.buildGraphicsCard();
        redMiComputer.buildMemory();
        redMiComputer.buildMainBord();
        return redMiComputer;
    }

}
