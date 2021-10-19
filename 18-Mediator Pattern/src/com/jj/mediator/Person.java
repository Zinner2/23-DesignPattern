package com.jj.mediator;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    /**
     * 传话
     * @param message
     */
    public abstract void constract(String message);

    /**
     * 获取信息
     * @param message
     */
    public abstract void getMessage(String message);
}
