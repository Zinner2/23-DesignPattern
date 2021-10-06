package com.jj.observe;

/**
 * 汇率接口
 * @author 张俊杰
 * @date 2021/10/6  - {TIME}
 */
public interface Rate {

    /**
     * 添加观察者公司
     * @param company
     */
    void add(Company company);

    /**
     * 移除观察者公司
     * @param company
     */
    void remove(Company company);

    /**
     * 改变汇率
     * @param number
     */
    void change(double number);
}
