package com.jj.entity.impl;

import com.jj.entity.Phone;

/**
 * @author 张俊杰
 * @date 2021/9/22  - {TIME}
 */
public class DellPhone extends Phone {
    public DellPhone(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.screen = builder.screen;
        this.size = builder.size;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String size;

        public Builder builderCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder builderScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder builderMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder builderSize(String size) {
            this.size = size;
            return this;
        }
        public DellPhone builder(){
            DellPhone dellPhone = new DellPhone(this);
            System.out.println("============戴尔手机生产完成============");
            return dellPhone;
        }
    }
}
