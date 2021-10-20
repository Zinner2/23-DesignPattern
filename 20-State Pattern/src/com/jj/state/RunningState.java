package com.jj.state;

/**
 *  电梯运行状态
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class RunningState extends ElevatorState {

    @Override
    public void openDoor() {
        System.out.println("当前 --->电梯运行状态 ---> 无法打开电梯门!");
    }

    @Override
    public void closeDoor() {
        System.out.println("当前 --->电梯运行状态 ---> 无法关闭电梯门!");
    }

    @Override
    public void stop() {
        System.out.println("当前 --->电梯运行状态 ---> 停止电梯!");
        super.context.setElevatorState(Context.STOPPING_STATE);
        super.context.stop();
    }

    @Override
    public void run() {
        System.out.println("当前 --->电梯运行状态 ---> 无法运行电梯!");
    }
}
