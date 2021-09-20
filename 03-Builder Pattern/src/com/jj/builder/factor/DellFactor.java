package com.jj.builder.factor;

import com.jj.builder.Builder;
import com.jj.builder.Computer;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class DellFactor extends Builder {

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("华硕/ASUS");
        System.out.println("安装了华硕/ASUS主板");
    }
    @Override
    public void buildCpu() {
        computer.setCpu("intel i7");
        System.out.println("安装了intel i7CPU");
    }
    @Override
    public void buildMemory() {
        computer.setMemory("三星 16G");
        System.out.println("安装了三星 16G内存");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("希捷1T");
        System.out.println("安装了希捷1T硬盘");
    }
    @Override
    public Computer createComputer() {
        return computer;
    }

}
