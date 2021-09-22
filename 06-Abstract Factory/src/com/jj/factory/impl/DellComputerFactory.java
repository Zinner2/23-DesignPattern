package com.jj.factory.impl;

import com.jj.entity.impl.DellComputer;
import com.jj.entity.Computer;
import com.jj.entity.Phone;
import com.jj.entity.impl.DellPhone;
import com.jj.factory.ComputerFactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class DellComputerFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        DellComputer dellComputer = new DellComputer.Builder()
                                                    .buildCpu("i7-9100K")
                                                    .buildMainBord("B50爆破弹")
                                                    .buildDarkDisk("西数550")
                                                    .buildMemory("金士顿 32G")
                                                    .buildGraphicsCard("GTX 1660Ti")
                                                    .builder();
        return dellComputer;
    }

    @Override
    public Phone createPhone() {
        DellPhone dellPhone = new DellPhone.Builder()
                                           .builderCpu("高通骁龙855")
                                           .builderMemory("运行内存8GB")
                                           .builderScreen("144HZ")
                                           .builderSize("6.2英寸")
                                           .builder();
        return dellPhone;
    }

}
