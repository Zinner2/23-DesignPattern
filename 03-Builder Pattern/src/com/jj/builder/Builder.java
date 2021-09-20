package com.jj.builder;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public abstract class Builder {

    protected Computer computer = new Computer();

    /**
     * 建主板
     */
    public abstract void buildMainBoard();

    /**
     * 建CPU
     */
    public abstract void buildCpu();

    /**
     * 建内存
     */
    public abstract void buildMemory();

    /**
     * 建硬盘
     */
    public abstract void buildHardDisk();

    /**
     * 构建电脑方法
     * @return
     */
    public abstract Computer createComputer();
}
