package com.jj.simplefactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class DellComputer extends Computer {

    public void buildCpu(){
        this.setCpu("i7-9100K");
        System.out.println("安装了 i7-9100K");
    }
    public void buildMainBord(){
        this.setCpu("B50爆破弹");
        System.out.println("安装了 B50爆破弹");
    }

    public void buildDarkDisk(){
        this.setCpu("西数550");
        System.out.println("安装了 西数550");
    }

    public void buildMemory(){
        this.setCpu("金士顿 32G");
        System.out.println("安装了 金士顿 32G");
    }

    @Override
    public Computer createComputer() {
        System.out.println("开始生产电脑");
        this.buildCpu();
        this.buildMainBord();
        this.buildDarkDisk();
        this.buildMemory();
        return this;
    }
}
