package com.jj.state;

/**
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class Client {
    public static void main(String[] args) {

        Context context = new Context();
        context.setElevatorState(new OpenningState());

        context.openDoor();

        context.closeDoor();

        context.run();

        context.stop();
    }
}
