package com.rudecrab.demo.common.multithreading;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/14 16:37
 **/
public class LockTest {
    static int age = 30;
    public static void main(String[] args) {
        System.out.println(methon1());
        //System.out.println(methon2());
        System.out.println(age);
        //Thread.join(100);

    }

    static int methon1() {
        System.out.println(age);
        int num = 60;
        System.out.println(num);
        return num;
    }
    static int methon2() {
        int age = 80;
        return age;
    }
}
