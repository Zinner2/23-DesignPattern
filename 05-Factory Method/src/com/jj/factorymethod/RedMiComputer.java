package com.jj.factorymethod;

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
    public void buildGraphicsCard(){
        this.setGraphicsCard("GTX 3060Ti");
        System.out.println("安装了 GTX 3060Ti");
    }

}
