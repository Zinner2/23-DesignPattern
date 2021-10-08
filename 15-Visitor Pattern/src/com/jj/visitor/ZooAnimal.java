package com.jj.visitor;

/**
 * 动物园动物
 * @author 张俊杰
 * @date 2021/10/8  - {TIME}
 */
public interface ZooAnimal {

    /**
     * 表演给参观者
     * @param visitor
     */
    void show(Visitor visitor);
}
