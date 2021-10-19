package com.jj.Interprete;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class Context {
    private Map<Variable,Integer> map = new HashMap<>();

    public void assign(Variable variable,Integer value){
        map.put(variable,value);
    }
    public int getValue(Variable variable){
        return map.get(variable);
    }
}
