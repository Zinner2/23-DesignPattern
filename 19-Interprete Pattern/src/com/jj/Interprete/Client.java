package com.jj.Interprete;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");

        Context context = new Context();
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);
        context.assign(e,2);

        AbstractExpress abstractExpress = new Add(a,new Sub(b,new Mul(c,new Dev(d,e))));

        System.out.println(abstractExpress.toString()  + " = "+     abstractExpress.interprete(context));
    }
}
