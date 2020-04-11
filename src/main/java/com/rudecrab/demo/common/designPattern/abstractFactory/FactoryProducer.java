package com.rudecrab.demo.common.designPattern.abstractFactory;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/11 18:42
 * @Version 1.0
 **/
public class FactoryProducer {
    static AbstractFactory getFactory(String type) {
        if (type.equals("dell")) {
            return new DellFactory();
        } else {
            return new LenovalFactory();
        }
    }
}
