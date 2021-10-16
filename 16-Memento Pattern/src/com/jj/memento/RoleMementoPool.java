package com.jj.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 角色备忘录池
 * @author 张俊杰
 * @date 2021/10/16  - {TIME}
 */
public class RoleMementoPool {

    Map<String,Memento> roleMementoMap;
    public RoleMementoPool() {
        roleMementoMap = new HashMap<String,Memento>();
        System.out.println("创建备忘录池");
    }
    public void add(String key,Memento value) {
        roleMementoMap.put(key,value);
    }
    public Memento get(String key) {
        return roleMementoMap.get(key);
    }
}
