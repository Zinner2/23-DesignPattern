package com.jj.buildextends;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class Computer {

    private String cpu;
    private String mainBoard;
    private String memory;
    private String hardDisk;

    public Computer(Build build){
        this.cpu = build.cpu;
        this.mainBoard = build.mainBoard;
        this.memory = build.memory;
        this.hardDisk = build.hardDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }

    public static final class Build{
        private String cpu;
        private String hardDisk;
        private String memory;
        private String mainBoard;
        public Build cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Build hardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }
        public Build memory(String memory){
            this.memory = memory;
            return this;
        }
        public Build mainBoard(String mainBoard){
            this.mainBoard = mainBoard;
            return this;
        }
        public Computer build(){
            Computer computer = new Computer(this);
            return computer;
        }
    }
}
