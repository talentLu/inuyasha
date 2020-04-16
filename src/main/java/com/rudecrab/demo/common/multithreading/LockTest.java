package com.rudecrab.demo.common.multithreading;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/14 16:37
 **/
public class LockTest {
    public static void main(String[] args) {
        System.out.println(new Thread(()->{
            System.out.println("gogogo");
        }) .getName());

    }
}
