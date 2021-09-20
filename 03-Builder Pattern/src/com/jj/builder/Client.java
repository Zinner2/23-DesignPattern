package com.jj.builder;

import com.jj.builder.factor.AppleFactor;
import com.jj.builder.factor.DellFactor;
import com.jj.builder.factor.LxFactor;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new AppleFactor());
        Computer computer = director.construct();
        System.out.println("“--------------------------”");
        System.out.println("CPU:  "+computer.getCpu());
        System.out.println("硬盘:  "+computer.getHardDisk());
        System.out.println("主板:  "+computer.getMainBoard());
        System.out.println("内存:  "+computer.getMemory());
    }
}
