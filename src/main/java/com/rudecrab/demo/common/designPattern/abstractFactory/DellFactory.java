package com.rudecrab.demo.common.designPattern.abstractFactory;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/11 18:29
 * @Version 1.0
 **/
public class DellFactory extends AbstractFactory {
    @Override
    void getKeyboard() {
        this.computer.setKeyboard(new DellKeyboard());
    }

    @Override
    void getMouse() {
        this.computer.setMouse(new DellMouse());
    }

    @Override
    Computer getComputer() {
        getKeyboard();
        getMouse();
        this.computer.keyboard.say();
        this.computer.mouse.say();
        System.out.println("这是戴尔电脑");
        return computer;
    }
}
