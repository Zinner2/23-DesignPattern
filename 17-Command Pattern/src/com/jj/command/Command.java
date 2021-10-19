package com.jj.command;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public abstract class Command {

    protected   Television television;

    public Command(Television television) {
        this.television = television;
    }

    /**
     * 执行命令
     */
    public abstract void execute();
}
