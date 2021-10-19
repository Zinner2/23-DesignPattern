package com.jj.command;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class Client {
    public static void main(String[] args) {

        // 创建电视机
        Television tv = new Television();
        // 创建遥控器
        RemoteControl rc = new RemoteControl();
        // 切换CCTV1
        rc.switchCommand(new CCTV1Command(tv));
        // 切换CCTV2
        rc.switchCommand(new CCTV2Command(tv));
        // 切换CCTV1
        rc.switchCommand(new CCTV1Command(tv));
        // 返回CCTV1
        rc.back();
    }
}
