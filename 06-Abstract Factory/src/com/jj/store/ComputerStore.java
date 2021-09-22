package com.jj.store;

import com.jj.entity.Computer;
import com.jj.entity.Phone;
import com.jj.factory.ComputerFactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class ComputerStore {

    private ComputerFactory computerFactory;

    public void setComputerFactory(ComputerFactory computerFactory) {
        this.computerFactory = computerFactory;
    }

    public Computer orderComputer(){
        Computer computer = computerFactory.createComputer();
        return computer;
    }
    public Phone orderPhone(){
        Phone phone = computerFactory.createPhone();
        return phone;
    }
}
