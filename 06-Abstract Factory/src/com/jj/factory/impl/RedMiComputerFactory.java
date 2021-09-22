package com.jj.factory.impl;

import com.jj.entity.impl.RedMiComputer;
import com.jj.entity.Computer;
import com.jj.entity.Phone;
import com.jj.entity.impl.RedMiPhone;
import com.jj.factory.ComputerFactory;

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

    @Override
    public Phone createPhone() {
        RedMiPhone redMiPhone = new RedMiPhone.Builder()
                                              .builderCpu("骁龙888")
                                              .builderMemory("256G")
                                              .builderScreen("144HZ")
                                              .builderSize("6.2英寸全面屏")
                                              .builder();
        return redMiPhone;
    }

}
