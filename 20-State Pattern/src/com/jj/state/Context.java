package com.jj.state;

/**
 * 环境角色
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class Context {

    public final static OpenningState OPENING_STATE = new OpenningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static StoppingState STOPPING_STATE = new StoppingState();
    public final static RunningState RUNNING_STATE = new RunningState();

    private ElevatorState elevatorState;

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {

        this.elevatorState = elevatorState;
        // 转换状态时环境也转换
      this.elevatorState.setContext(this);
    }

    public void openDoor() {
        this.elevatorState.openDoor();
    }

    public void closeDoor() {
        this.elevatorState.closeDoor();
    }

    public void stop() {
        this.elevatorState.stop();
    }

    public void run() {
        this.elevatorState.run();
    }
}
