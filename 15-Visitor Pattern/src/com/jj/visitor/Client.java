package com.jj.visitor;

/**
 * @author 张俊杰
 * @date 2021/10/8  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.add(new Telephone());
        zoo.add(new Tiger());

        zoo.action(new Baby());
        zoo.action(new Parents());
    }
}
