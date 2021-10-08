package com.jj.visitor;

/**
 * @author 张俊杰
 * @date 2021/10/8  - {TIME}
 */
public class Tiger implements ZooAnimal {
    @Override
    public void show(Visitor visitor) {
        visitor.visit(this);
        System.out.println("Tiger ---> show");
    }
}
