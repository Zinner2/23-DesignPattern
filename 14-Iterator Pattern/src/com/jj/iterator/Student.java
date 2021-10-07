package com.jj.iterator;

/**
 * 学生实体类
 * @author 张俊杰
 * @date 2021/10/7  - {TIME}
 */
public class Student {

    private String name;

    private String number;


    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
