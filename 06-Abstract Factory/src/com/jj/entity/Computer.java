package com.jj.entity;

/**
 * @author 张俊杰
 * @date 2021/9/21  - {TIME}
 */
public abstract class Computer {

    private String cpu;
    private String mainBord;
    private String darkDisk;
    private String memory;
    private String graphicsCard;

    public String getMainBord() {
        return mainBord;
    }

    public void setMainBord(String mainBord) {
        this.mainBord = mainBord;
    }

    public String getDarkDisk() {
        return darkDisk;
    }

    public void setDarkDisk(String darkDisk) {
        this.darkDisk = darkDisk;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBord='" + mainBord + '\'' +
                ", darkDisk='" + darkDisk + '\'' +
                ", memory='" + memory + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

}
