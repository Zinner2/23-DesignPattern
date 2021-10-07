package com.jj.iterator;

/**
 * 学生抽象迭代器
 * @author 张俊杰
 * @date 2021/10/7  - {TIME}
 */
public interface StudentIterator {

    /**
     * 是否存在下一个学生
     * @return
     */
    boolean hasNext();

    /**
     * 获取下个学生
     * @return
     */
    Student next();
}
