package com.jj.entity;

/**
 * @author 张俊杰
 * @date 2021/9/22  - {TIME}
 */
public abstract class Phone {

   public String cpu;
   public String screen;
   public String memory;
   public String size;


    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
