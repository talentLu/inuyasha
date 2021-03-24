package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/3/15 18:26
 **/
public class Student{
    private int age;
    public int getAge(){
        return age;
    }
    public void say(){
        System.out.println("hello Student");
    }

    private Grade getGrade() {
        return new Grade();
    }

    private class Grade{
        public void say(){
            Student.this.say();
            System.out.println(Student.this.getAge());
            System.out.println("hello Grade");
        }
    }
    public static void main(String[] args) {
        Student stu = new Student();
        Student.Grade grade = stu.getGrade();
        grade.say();
    }
}
