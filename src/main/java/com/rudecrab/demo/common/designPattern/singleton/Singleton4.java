package com.rudecrab.demo.common.designPattern.singleton;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/16 17:32
 **/
public class Singleton4 {
    private Singleton4() {
    }

    public Singleton4 getInstance() {
        return Singleton4Inner.SINGLETON;
    }

    private static class Singleton4Inner {
        private static Singleton4 SINGLETON = new Singleton4();
    }
}
