package com.jj.simplefactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class Client {

    public static void main(String[] args) {
        ComputerStore computerStore = new ComputerStore();
        Computer computer = computerStore.orderComputer("DELL");
        System.out.println(computer);
        System.out.println(computer.getCpu());
        System.out.println(computer.getDarkDisk());
        System.out.println(computer.getMainBord());
        System.out.println(computer.getMemory());
    }
}
