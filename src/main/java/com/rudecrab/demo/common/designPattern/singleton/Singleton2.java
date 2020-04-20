package com.rudecrab.demo.common.designPattern.singleton;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2020/4/16 17:32
 **/
public class Singleton2 {
    private static volatile Singleton2 singleton2;

    private Singleton2() {
    }

    public Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
