package com.jj.adpater.classadapter;

/**
 * 类适配器
 * @author 张俊杰
 * @date 2021/9/24  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        /*
         * 当前使用USB
                    ==== 成功使用USB接口 ====
                    ClientSocket clientSocket = new ClientSocket(new UsbServiceImpl());
                    clientSocket.use();
        */

        // 当前使用Usb转Typec
        ClientSocket clientSocket = new ClientSocket(new UsbAdapterTypec());
        // ==== 成功使用Typec接口 ====
        clientSocket.use();

    }
}
