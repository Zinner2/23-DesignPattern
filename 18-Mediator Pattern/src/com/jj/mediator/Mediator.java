package com.jj.mediator;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public abstract class Mediator {

    /**
     * 合同签订
     * @param message
     * @param person
     */
    public abstract void constract(String message,Person person);
}
