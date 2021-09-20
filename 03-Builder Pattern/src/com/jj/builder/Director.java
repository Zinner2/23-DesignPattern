package com.jj.builder;

/**
 * @author JJ
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装电脑方法
     * @return
     */
    public Computer construct() {
        System.out.println("“--------------------------”");
        System.out.println((builder) + "开始生产电脑");
        builder.buildHardDisk();
        builder.buildMainBoard();
        builder.buildCpu();
        builder.buildMemory();
        return builder.createComputer();
    }

    @Override
    public String toString() {
        return "builder{" + "builder=" + builder + '}';
    }
}
