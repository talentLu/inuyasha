package com.rudecrab.demo.common.designPattern.abstractFactory;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/11 18:26
 * @Version 1.0
 **/
public abstract class AbstractFactory {
    Computer computer = new Computer();
    abstract void getKeyboard();
    abstract void getMouse ();
    abstract Computer getComputer();
}
