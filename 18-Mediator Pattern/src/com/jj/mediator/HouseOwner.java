package com.jj.mediator;

/**
 * 房主
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void constract(String message) {
        mediator.constract(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息是：" + message);
    }
}
