package com.jj.builder.factor;

import com.jj.builder.Builder;
import com.jj.builder.Computer;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class AppleFactor extends Builder {
    @Override
    public void buildMainBoard() {
        computer.setMainBoard("b50爆破弹");
        System.out.println("安装了b50爆破弹");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("i7-9100k");
        System.out.println("安装了i7-9100k");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("金士顿 16G");
        System.out.println("安装了金士顿 16G");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("西数1T");
        System.out.println("安装了西数1T");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
