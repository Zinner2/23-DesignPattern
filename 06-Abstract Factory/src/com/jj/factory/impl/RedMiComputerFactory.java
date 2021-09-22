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
        RedMiComputer redMiComputer = new RedMiComputer.Builder()
                                                       .buildCpu("Intel 酷睿i7 10750H")
                                                       .buildDarkDisk("PCI-e SSD固态硬盘")
                                                       .buildMemory("DDR4 2933 32G")
                                                       .buildGraphicsCard("GTX 3060Ti")
                                                       .buildMainBord("B50爆破弹")
                                                       .builder();

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
