package com.jj.shallowcloning;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class UserCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User();
        user.setUsername("jj");
        user.setPassword("123456");
        User userClone = user.clone();
        /*
            原型对象创建完成
            username = jj
            password = 123456
            原型对象与克隆对象比较 ？ false
            user = 460141958
            userClone = 1163157884

        */
        System.out.println("username = "+userClone.getUsername());
        System.out.println("password = "+userClone.getPassword());
        System.out.println("原型对象与克隆对象比较 ？ " +(user == userClone));
        System.out.println("user = " +user.hashCode());
        System.out.println("userClone = " +userClone.hashCode());



    }
}
