package com.jj.facade_pattern;

/**
 * @author 张俊杰
 * @date 2021/10/3  - {TIME}
 */
public class Facade {
    private Light light;
    private Tv tv;
    private Refrigerator refrigerator;

    public Facade() {
        this.light = new Light();
        this.tv = new Tv();
        this.refrigerator = new Refrigerator();
    }

    public void say(String message){
        if (message.contains("打开")){
            on();
        }else if (message.contains("关闭")){
            off();
        }else {
            System.out.println("系统出错,无法执行任务");
        }
    }

    public void on(){
        light.on();
        tv.on();
        refrigerator.on();
    }

    public void off(){
        light.off();
        tv.off();
        refrigerator.off();
    }
}
