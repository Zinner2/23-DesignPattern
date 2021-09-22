package com.jj.entity.impl;

import com.jj.entity.Computer;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public class DellComputer extends Computer {

    public DellComputer(Builder builder){
        this.setCpu(builder.cpu);
        this.setMainBord(builder.mainBord);
        this.setDarkDisk(builder.darkDisk);
        this.setMemory(builder.memory);
        this.setGraphicsCard(builder.graphicsCard);
    }
    public static final class Builder{
        private String cpu;
        private String mainBord;
        private String darkDisk;
        private String memory;
        private String graphicsCard;
        public Builder buildCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder buildMainBord(String mainBord){
            this.mainBord = mainBord;
            return this;
        }

        public Builder buildDarkDisk(String darkDisk){
            this.darkDisk = darkDisk;
            return this;
        }

        public Builder buildMemory(String memory){
            this.memory = memory;
            return this;
        }
        public Builder buildGraphicsCard(String graphicsCard){
            this.graphicsCard = graphicsCard;
            return this;
        }
        public DellComputer builder(){
            DellComputer dellComputer = new DellComputer(this);
            System.out.println("============戴尔电脑生产完成============");
            return  dellComputer;
        }
    }


}
