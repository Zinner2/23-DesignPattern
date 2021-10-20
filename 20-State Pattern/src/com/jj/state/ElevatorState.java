package com.jj.state;

/**
 * 电梯状态
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public abstract class ElevatorState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 打开电梯门
     */
    public abstract void openDoor();

    /**
     * 关闭电梯门
     */
    public abstract void closeDoor();

    /**
     * 关闭电梯
     */
    public abstract void stop();

    /**
     * 开启电梯
     */
    public abstract void run();

}
