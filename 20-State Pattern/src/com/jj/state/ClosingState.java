package com.jj.state;

/**
 *  电梯门关闭状态
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class ClosingState extends ElevatorState {

    @Override
    public void openDoor() {
        System.out.println("当前 ---> 电梯门关闭状态 ---> 打开电梯门!");
        super.context.setElevatorState(Context.OPENING_STATE);
        super.context.openDoor();
    }

    @Override
    public void closeDoor() {
        System.out.println("当前 ---> 电梯门关闭状态 ---> 无法关闭电梯门!");
    }

    @Override
    public void stop() {
        System.out.println("当前 ---> 电梯门关闭状态 ---> 电梯还没运行,无法停止电梯!");
    }

    @Override
    public void run() {
        System.out.println("当前 ---> 电梯门关闭状态 ---> 运行电梯!");
        super.context.setElevatorState(Context.RUNNING_STATE);
        super.context.run();
    }
}
