package com.jj.iterator;

import java.util.List;

/**
 * @author 张俊杰
 * @date 2021/10/7  - {TIME}
 */
public class StudentIteratorImpl implements StudentIterator {

    public List<Student> studentList;

    public int position = -1;

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        if(position >= studentList.size() - 1) {
            return false;
        } else {
            position += 1;
            return true;
        }
    }

    @Override
    public Student next() {
        return studentList.get(position);
    }

}
