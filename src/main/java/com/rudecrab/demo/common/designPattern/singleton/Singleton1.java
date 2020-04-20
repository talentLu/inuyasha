package com.rudecrab.demo.common.designPattern.singleton;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/16 17:22
 **/
public class Singleton1 {
    private static final Singleton1 SINGLETON = new Singleton1();

    private Singleton1() {
    }

    public Singleton1 getInstance() {
        return SINGLETON;
    }
}
