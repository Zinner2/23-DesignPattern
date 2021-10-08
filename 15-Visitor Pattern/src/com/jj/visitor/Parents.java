package com.jj.visitor;

/**
 * @author 张俊杰
 * @date 2021/10/8  - {TIME}
 */
public class Parents implements Visitor {

    @Override
    public void visit(Telephone telephone) {
        System.out.println("Parents 正在看 telephone");
    }

    @Override
    public void visit(Tiger tiger) {
        System.out.println("Parents 正在看 tiger");
    }
}
