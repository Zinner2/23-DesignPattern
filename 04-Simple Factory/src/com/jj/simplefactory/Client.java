package com.jj.simplefactory;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class Client {

    public static void main(String[] args) {
        ComputerStore computerStore = new ComputerStore();
        Computer computer = computerStore.orderComputer("REDMI");
        System.out.println(computer);
        System.out.println("CPU = "+computer.getCpu());
        System.out.println("DarkDisk = "+computer.getDarkDisk());
        System.out.println("MainBord = "+computer.getMainBord());
        System.out.println("Memory = "+computer.getMemory());
    }
}
