package com.jj.visitor;

/**
 * 参观动物园
 * @author 张俊杰
 * @date 2021/10/8  - {TIME}
 */
public interface Visitor {

    /**
     * 看 telephone
     * @param telephone
     */
    void visit(Telephone telephone);

    /**
     * 看 tiger
     * @param tiger
     */
    void visit(Tiger tiger);
}
