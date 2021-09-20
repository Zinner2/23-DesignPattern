package com.jj.builder.factor;

import com.jj.builder.Builder;
import com.jj.builder.Computer;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class LxFactor extends Builder {

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("技嘉/GIGABYTE");
        System.out.println("安装了技嘉/GIGABYTE");
    }
    @Override
    public void buildCpu() {
        computer.setCpu("AMD锐龙 53600");
        System.out.println("安装了AMD锐龙 53600CPU");
    }
    @Override
    public void buildMemory() {
        computer.setMemory("金士顿 32G");
        System.out.println("安装了金士顿 32G内存");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("东芝1T");
        System.out.println("安装了东芝1T硬盘");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }

}
