package com.jj.buildextends;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.Build()
                                        .cpu("i7-9100k")
                                        .hardDisk("西数 1T")
                                        .memory("金士顿 16G")
                                        .mainBoard("b50爆破弹")
                                        .build();
        System.out.println("computer="+computer);
    }
}
