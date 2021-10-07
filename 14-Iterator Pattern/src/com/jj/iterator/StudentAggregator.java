package com.jj.iterator;

/**
 *  学生抽象聚集类
 * @author 张俊杰
 * @date 2021/10/7  - {TIME}
 */
public interface StudentAggregator {


    /**
     * 添加学生
     * @param student
     */
    void addStudent(Student student);

    /**
     * 移除学生
     * @param student
     */
    void removeStudent(Student student);

    /**
     * 获取学生迭代器
     * @return
     */
    StudentIterator getStudentIterator();
}
