package com.jj.iterator;


/**
 * @author 张俊杰
 * @date 2021/10/7  - {TIME}
 */
public class Client {

    public static void main(String[] args) {
        StudentAggregator studentAggregator = new StudentAggregatorImpl();

        studentAggregator.addStudent(new Student("张三1","123"));
        studentAggregator.addStudent(new Student("张三2","123"));
        studentAggregator.addStudent(new Student("张三3","123"));
        studentAggregator.addStudent(new Student("张三4","123"));

        StudentIterator studentIterator = studentAggregator.getStudentIterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
