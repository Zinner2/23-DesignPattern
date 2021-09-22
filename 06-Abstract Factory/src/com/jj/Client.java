package com.jj;

import com.jj.entity.Computer;
import com.jj.entity.Phone;
import com.jj.factory.ComputerFactory;
import com.jj.factory.impl.DellComputerFactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class Client {

    public static void main(String[] args) {
        // 生成电脑商店对象
        ComputerStore computerStore = new ComputerStore();

        // 生成电脑工厂对象
         ComputerFactory computerFactory = new DellComputerFactory();
        // 用户进入红米线下店
//        ComputerFactory computerFactory = new RedMiComputerFactory();

        computerStore.setComputerFactory(computerFactory);
        //购买电脑
        Computer computer = computerStore.orderComputer();
        //购买手机
        Phone phone = computerStore.orderPhone();

        System.out.println("=========电脑生产中==========");
        System.out.println(computer);

        System.out.println("=========手机生产中==========");
        System.out.println(phone);

    }
}
