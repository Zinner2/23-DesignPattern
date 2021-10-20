package com.jj.state;

/**
 *  电梯停止状态
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class StoppingState extends ElevatorState {

    @Override
    public void openDoor() {
        System.out.println("当前 ---> 电梯停止状态 ---> 正在打开电梯门!");
        super.context.setElevatorState(Context.OPENING_STATE);
        super.context.openDoor();
    }

    @Override
    public void closeDoor() {
        System.out.println("当前 ---> 电梯停止状态 ---> 正在关闭电梯门!");
        super.context.setElevatorState(Context.CLOSING_STATE);
        super.context.closeDoor();
    }

    @Override
    public void stop() {
        System.out.println("当前 ---> 电梯停止状态 --->无法停止电梯!");
    }

    @Override
    public void run() {
        System.out.println("当前 ---> 电梯停止状态 ---> 无法运行电梯!");
        super.context.setElevatorState(Context.RUNNING_STATE);
        super.context.run();
    }
}
