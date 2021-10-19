package com.jj.Interprete;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class Variable extends AbstractExpress {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interprete(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
