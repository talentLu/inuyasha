package com.rudecrab.demo.common.designPattern.abstractFactory;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/11 18:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        AbstractFactory dell = FactoryProducer.getFactory("dell");
        Computer computer = dell.getComputer();
    }
}
