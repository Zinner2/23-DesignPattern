package com.jj.factorymethod;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class Client {

    public static void main(String[] args) {

        ComputerStore computerStore = new ComputerStore();

        //ComputerFactory computerFactory = new DellComputerFactory();
        ComputerFactory computerFactory = new RedMiComputerFactory();
        computerStore.setComputerFactory(computerFactory);

        Computer computer = computerStore.orderComputer();

        System.out.println("===========================");
        System.out.println(computer);
        System.out.println("Cpu="+computer.getCpu());
        System.out.println("DarkDisk="+computer.getDarkDisk());
        System.out.println("GraphicsCard="+computer.getGraphicsCard());
        System.out.println("Memory="+computer.getMemory());
        System.out.println("MainBord="+computer.getMainBord());
    }
}
