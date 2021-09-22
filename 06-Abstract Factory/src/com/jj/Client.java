package com.jj;

import com.jj.entity.Computer;
import com.jj.entity.Phone;
import com.jj.factory.ComputerFactory;
import com.jj.factory.impl.DellComputerFactory;
import com.jj.store.ComputerStore;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class Client {

    public static void main(String[] args) {

        // 生成电脑工厂对象
         ComputerFactory computerFactory = new DellComputerFactory();
        //购买电脑
        Computer computer = computerFactory.createComputer();
        //购买手机
        Phone phone = computerFactory.createPhone();

        System.out.println("=========电脑生产中==========");
        System.out.println(computer);

        System.out.println("=========手机生产中==========");
        System.out.println(phone);

    }
}
