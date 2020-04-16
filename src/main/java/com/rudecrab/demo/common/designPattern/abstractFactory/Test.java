package com.rudecrab.demo.common.designPattern.abstractFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/11 18:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        /*AbstractFactory dell = FactoryProducer.getFactory("dell");
        Computer computer = dell.getComputer();*/
        AtomicInteger atomicInteger = new AtomicInteger(100);
        atomicInteger.compareAndSet(100,200);
        System.out.println(atomicInteger);

    }
}
