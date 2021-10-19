package com.jj.Interprete;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class Dev extends AbstractExpress {
    private AbstractExpress left;
    private AbstractExpress right;

    public Dev(AbstractExpress left, AbstractExpress right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interprete(Context context) {
        return left.interprete(context) / right.interprete(context);
    }

    @Override
    public String toString() {
        return "(" +left.toString()+" / " +right.toString() + ")";
    }
}
