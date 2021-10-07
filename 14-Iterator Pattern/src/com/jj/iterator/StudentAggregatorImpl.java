package com.jj.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张俊杰
 * @date 2021/10/7  - {TIME}
 */
public class StudentAggregatorImpl implements StudentAggregator {

    private List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(studentList);
    }

}
