package com.jj.adpater.objectadapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 张俊杰
 * @date 2021/9/24  - {TIME}
 */
public class Client {
    public static void main(String[] args) {

        ClientSocket clientSocket = new ClientSocket(new UsbAdapterTypec(new TypecServiceImpl()));

        clientSocket.use();
    }

}
