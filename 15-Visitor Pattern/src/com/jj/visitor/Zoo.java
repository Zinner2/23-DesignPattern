package com.jj.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 动物园
 * @author 张俊杰
 * @date 2021/10/8  - {TIME}
 */
public class Zoo {

    private List<ZooAnimal> animalList = new ArrayList<>();

    public void add(ZooAnimal zooAnimal){
        animalList.add(zooAnimal);
    }


    public void remove(ZooAnimal zooAnimal){
        animalList.remove(zooAnimal);
    }

    public void action(Visitor visitor){
        for (ZooAnimal zooAnimal : animalList){
            zooAnimal.show(visitor);
        }
    }
}
