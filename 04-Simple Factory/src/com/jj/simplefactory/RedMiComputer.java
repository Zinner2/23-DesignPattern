package com.jj.simplefactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class RedMiComputer extends Computer{

    public void buildCpu(){
        this.setCpu("Intel 酷睿i7 10750H");
        System.out.println("安装了 Intel 酷睿i7 10750H");
    }
    public void buildMainBord(){
        this.setMainBord("B50爆破弹");
        System.out.println("安装了 B50爆破弹");
    }

    public void buildDarkDisk(){
        this.setDarkDisk("PCI-e SSD固态硬盘");
        System.out.println("安装了 PCI-e SSD固态硬盘");
    }

    public void buildMemory(){
        this.setMemory("DDR4 2933 32G");
        System.out.println("安装了  DDR4 2933 32G");
    }

    @Override
    public Computer createComputer() {
        System.out.println("开始生成RedMi电脑");
        this.buildCpu();
        this.buildDarkDisk();
        this.buildMainBord();
        this.buildMemory();
        return this;
    }
}
