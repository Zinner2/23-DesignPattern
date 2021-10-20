package com.jj.state;

/**
 *  电梯门打开状态
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class OpenningState extends ElevatorState {

    @Override
    public void openDoor() {
        System.out.println("当前 ---> 电梯门打开状态 ---> 无法打开电梯门!");
    }

    @Override
    public void closeDoor() {
        System.out.println("当前 ---> 电梯门打开状态 ---> 正在关闭电梯门!");
        super.context.setElevatorState(Context.CLOSING_STATE);
        super.context.closeDoor();
    }

    @Override
    public void stop() {
        System.out.println("当前 ---> 电梯门打开 ---> 无法停止电梯!");
    }

    @Override
    public void run() {
        System.out.println("当前 ---> 电梯门打开 ---> 无法运行电梯!");
    }
}
